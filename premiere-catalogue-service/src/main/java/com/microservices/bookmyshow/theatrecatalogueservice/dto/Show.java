package com.microservices.bookmyshow.theatrecatalogueservice.dto;

import java.util.List;

import com.microservices.bookmyshow.theatrecatalogueservice.dto.Seat;

public class Show {

	private int showId;
	private java.time.LocalDateTime showTime;
	// Indicate if Available, Almost full or House Full
	private String status;
	private int totalSeats;
	private int remainingSeats;
	
	private List<Seat> availableSeats;
	
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public java.time.LocalDateTime getShowTime() {
		return showTime;
	}
	public void setShowTime(java.time.LocalDateTime showTime) {
		this.showTime = showTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getRemainingSeats() {
		return remainingSeats;
	}
	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}
}
