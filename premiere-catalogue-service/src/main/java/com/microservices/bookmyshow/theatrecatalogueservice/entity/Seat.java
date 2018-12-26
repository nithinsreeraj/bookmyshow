package com.microservices.bookmyshow.theatrecatalogueservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seat {
	
	@Id
	private int seatId;
	private int showId;
	private int seatName;
	private int status;
	private double price;
	
	public Seat() {
		
	}
	
	
	public Seat(int seatId, int showId, int seatName, int status, double price) {
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


	public int getSeatName() {
		return seatName;
	}
	public void setSeatName(int seatName) {
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
