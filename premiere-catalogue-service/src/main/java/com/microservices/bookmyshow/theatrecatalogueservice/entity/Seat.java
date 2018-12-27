package com.microservices.bookmyshow.theatrecatalogueservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seat {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seatId;
	private int showId;
    private String seatName;
	private int status;
	private double price;
	
	public Seat() {
		
	}
	
	
    public Seat(int seatId, int showId, String seatName, int status, double price)
    {
		super();
		this.seatId = seatId;
		this.setShowId(showId);
		this.seatName = seatName;
		this.status = status;
		this.price = price;
	}


	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public int getShowId() {
		return showId;
	}


	public void setShowId(int showId) {
		this.showId = showId;
	}


    public String getSeatName()
    {
		return seatName;
	}

    public void setSeatName(String seatName)
    {
		this.seatName = seatName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
