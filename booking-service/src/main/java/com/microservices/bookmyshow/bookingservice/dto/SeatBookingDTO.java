package com.microservices.bookmyshow.bookingservice.dto;

import java.util.List;

public class SeatBookingDTO
{

    private int showId;
    private List<String> selectedSeats;
    private int status;

    public SeatBookingDTO()
    {

    }

    public SeatBookingDTO(int showId, List<String> selectedSeats, int status)
    {
        super();
        this.showId = showId;
        this.selectedSeats = selectedSeats;
        this.status = status;
    }

    public int getShowId()
    {
        return showId;
    }

    public void setShowId(int showId)
    {
        this.showId = showId;
    }

    public List<String> getSelectedSeats()
    {
        return selectedSeats;
    }

    public void setSelectedSeats(List<String> selectedSeats)
    {
        this.selectedSeats = selectedSeats;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

}
