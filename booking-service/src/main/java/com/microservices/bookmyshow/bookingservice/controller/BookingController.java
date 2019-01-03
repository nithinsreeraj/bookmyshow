package com.microservices.bookmyshow.bookingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.bookmyshow.bookingservice.config.TheatreCatalogueServiceProxy;
import com.microservices.bookmyshow.bookingservice.dto.SeatBookingDTO;
import com.microservices.bookmyshow.bookingservice.entity.BookingHistory;
import com.microservices.bookmyshow.bookingservice.repo.BookingServiceRepository;

@RestController
public class BookingController
{

    @Autowired
    private TheatreCatalogueServiceProxy proxy;

    @Autowired
    private BookingServiceRepository repo;

    @PostMapping("/book")
    public Object confirmSeats(@RequestBody SeatBookingDTO seatBookingDTO)
    {
        seatBookingDTO.setStatus(1);
        BookingHistory bookingHistory = proxy.bookSeats(seatBookingDTO);
        if (bookingHistory != null) {
            repo.save(bookingHistory);
            return bookingHistory;
        }
        return "Selected seats are no longer available";
    }

    @PostMapping("/booking")
    public BookingHistory confirmSeats2(@RequestBody SeatBookingDTO seatBookingDTO)
    {
        
        ResponseEntity<BookingHistory> responseEntity = new RestTemplate().postForEntity("http://localhost:8100/bookseats", seatBookingDTO, BookingHistory.class);
        BookingHistory bookingHistory = responseEntity.getBody();
        if (bookingHistory != null) {
            repo.save(bookingHistory);
        }
        return bookingHistory;
    
    }


}
