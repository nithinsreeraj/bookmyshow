package com.microservices.bookmyshow.bookingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public BookingHistory confirmSeats(@RequestBody SeatBookingDTO seatBookingDTO)
    {
        seatBookingDTO.setStatus(1);
        BookingHistory bookingHistory = proxy.bookSeats(seatBookingDTO);
        if (bookingHistory != null) {
            repo.save(bookingHistory);
        }
        return bookingHistory;
    }


}
