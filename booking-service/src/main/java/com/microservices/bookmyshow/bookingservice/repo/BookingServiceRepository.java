package com.microservices.bookmyshow.bookingservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.bookmyshow.bookingservice.entity.BookingHistory;

public interface BookingServiceRepository extends JpaRepository<BookingHistory, Integer>
{

}
