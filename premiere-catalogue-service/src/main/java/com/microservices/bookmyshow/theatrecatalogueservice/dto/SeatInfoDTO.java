package com.microservices.bookmyshow.theatrecatalogueservice.dto;

import java.util.List;

public class SeatInfoDTO
{

    private int showId;
    private List<String> selectedSeats;
    private int status;

    public SeatInfoDTO()
    {

    }

    public SeatInfoDTO(int showId, List<String> selectedSeats, int status)
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
