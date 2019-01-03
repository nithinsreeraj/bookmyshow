package com.microservices.bookmyshow.theatrecatalogueservice.dto;

import java.time.LocalDateTime;

public class BookingDetailsDTO
{


    private Integer bookingId;

    private int showId;
    private String userName;
    private double totalCost;

    private java.time.LocalDateTime bookingTime;
    private int numberOfTickets;

    public BookingDetailsDTO()
    {

    }

    public BookingDetailsDTO(int showId, String userName, double totalCost, LocalDateTime bookingTime, int numberOfTickets)
    {
        super();
        this.showId = showId;
        this.userName = userName;
        this.totalCost = totalCost;
        this.bookingTime = bookingTime;
        this.numberOfTickets = numberOfTickets;
    }

    public Integer getBookingId()
    {
        return bookingId;
    }

    public void setBookingId(Integer bookingId)
    {
        this.bookingId = bookingId;
    }

    public int getShowId()
    {
        return showId;
    }

    public void setShowId(int showId)
    {
        this.showId = showId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public double getTotalCost()
    {
        return totalCost;
    }

    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }

    public java.time.LocalDateTime getBookingTime()
    {
        return bookingTime;
    }

    public void setBookingTime(java.time.LocalDateTime bookingTime)
    {
        this.bookingTime = bookingTime;
    }

    public int getNumberOfTickets()
    {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets)
    {
        this.numberOfTickets = numberOfTickets;
    }


}
