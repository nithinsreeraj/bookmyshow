package com.microservices.bookmyshow.bookingservice.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.microservices.bookmyshow.bookingservice.dto.SeatBookingDTO;
import com.microservices.bookmyshow.bookingservice.entity.BookingHistory;

@FeignClient(name = "zuul-api-gateway-server")
@RibbonClient(name = "theatre-catalogue-service")
public interface TheatreCatalogueServiceProxy
{
    @PostMapping("/theatre-catalogue-service/bookseats")
    public BookingHistory bookSeats(SeatBookingDTO seatBookingDTO);
}
