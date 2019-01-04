package com.microservices.bookmyshow.theatrecatalogueservice.controller;

import java.text.ParseException;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.bookmyshow.theatrecatalogueservice.dto.BookingDetailsDTO;
import com.microservices.bookmyshow.theatrecatalogueservice.dto.SeatInfoDTO;
import com.microservices.bookmyshow.theatrecatalogueservice.entity.Seat;
import com.microservices.bookmyshow.theatrecatalogueservice.entity.Show;
import com.microservices.bookmyshow.theatrecatalogueservice.entity.Theatre;
import com.microservices.bookmyshow.theatrecatalogueservice.repo.SeatRepository;
import com.microservices.bookmyshow.theatrecatalogueservice.repo.ShowRepository;
import com.microservices.bookmyshow.theatrecatalogueservice.repo.TheatreRepository;


@RestController
public class ShowController {

	@Autowired TheatreRepository theatreRepo;
	@Autowired ShowRepository showRepo;

    @Autowired
    private SeatRepository seatRepo;

	@GetMapping("/theatres")
	public @ResponseBody List<Theatre> getTheatres(@RequestParam("cityId") int cityId, @RequestParam("movieId") int movieId) throws ParseException{
		
		if(cityId==0 || movieId == 0) {
			throw new ParseException(" Missing query parameters",0);
		}
		
		List<Theatre> result = theatreRepo.findByCityIdAndMovieId(cityId, movieId);
		
		return result;
		
	}
	
	@GetMapping("/theatres/{theatreId}/shows")
	public  @ResponseBody List<Show> getShows(@PathVariable("theatreId") int theatreId) throws ParseException{
		
		if(theatreId==0) {
			throw new ParseException(" Missing query parameters",0);
		}
		
		List<Show> shows = showRepo.findByTheatreId(theatreId);
		
		return shows;
		
	}

    @PostMapping("/bookseats")
    public BookingDetailsDTO bookSeats(@RequestBody SeatInfoDTO seatInfoDTO)
    {
        List<Seat> selectedSeats = seatRepo.findByShowIdAndSeatNameIn(seatInfoDTO.getShowId(), seatInfoDTO.getSelectedSeats());
        if (selectedSeats.stream().anyMatch(seat -> seat.getStatus() != 0)) {
            return null;
        }
        double totalCost = selectedSeats.stream().mapToDouble(seat -> seat.getPrice()).sum();
        selectedSeats.stream().forEach(seat -> seat.setStatus(1));
        selectedSeats.stream().forEach(seat -> seatRepo.save(seat));
        BookingDetailsDTO bookingDetails = new BookingDetailsDTO(seatInfoDTO.getShowId(), "test user", totalCost, java.time.LocalDateTime.now(), selectedSeats.size());
        return bookingDetails;
        

    }
}
