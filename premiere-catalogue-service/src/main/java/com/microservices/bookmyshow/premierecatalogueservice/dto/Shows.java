package com.microservices.bookmyshow.premierecatalogueservice.dto;

public class Shows {

	private int showId;
	private java.time.LocalTime showTime;
	// Indicate if Available, Almost full or House Full
	private String status;
	
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public java.time.LocalTime getShowTime() {
		return showTime;
	}
	public void setShowTime(java.time.LocalTime showTime) {
		this.showTime = showTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
