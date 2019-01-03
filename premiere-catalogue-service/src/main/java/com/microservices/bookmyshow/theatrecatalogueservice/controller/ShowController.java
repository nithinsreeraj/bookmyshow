package com.microservices.bookmyshow.theatrecatalogueservice.controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.bookmyshow.theatrecatalogueservice.dto.BookingDetailsDTO;
import com.microservices.bookmyshow.theatrecatalogueservice.dto.SeatInfoDTO;
import com.microservices.bookmyshow.theatrecatalogueservice.dto.ShowFilterDTO;
import com.microservices.bookmyshow.theatrecatalogueservice.entity.Seat;
import com.microservices.bookmyshow.theatrecatalogueservice.entity.Theatre;
import com.microservices.bookmyshow.theatrecatalogueservice.repo.SeatRepository;
import com.microservices.bookmyshow.theatrecatalogueservice.repo.TheatreRepository;


@RestController
public class ShowController {

	@Autowired TheatreRepository theatreRepo;
	@Autowired EntityManager manager;

    @Autowired
    private SeatRepository seatRepo;

	@PostMapping("/shows")
	public List<Theatre> getShows(@RequestBody ShowFilterDTO filterDTO){
		
		StringBuffer buf = new StringBuffer ();
		buf.append(" select theatreId, theatreName, cityId, movieId from Theatre t ");
//		buf.append(" inner join show sh on sh.theatre_id = t.theatre_id");
//		buf.append(" where 1=1");
//		buf.append(" and t.movie_id = " + filterDTO.getMovieId());
//		buf.append(" and t.city_id = " + filterDTO.getCityId());
//		buf.append(" and sh.show_date_time = " + filterDTO.getShowDateTime());
		
		List<Theatre> result = manager.createQuery(buf.toString()).getResultList();
		
		
		return result;

		
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
