package com.microservices.bookmyshow.theatrecatalogueservice.dto;

public class Seat {

	private int seatId;
	private int seatName;
	private int status;
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
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
}
