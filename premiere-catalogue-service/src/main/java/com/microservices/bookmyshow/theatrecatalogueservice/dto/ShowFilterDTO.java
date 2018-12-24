package com.microservices.bookmyshow.theatrecatalogueservice.dto;

public class ShowFilterDTO {
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public java.time.LocalDate getDate() {
		return date;
	}
	public void setDate(java.time.LocalDate date) {
		this.date = date;
	}
	private int movieId;
	private String city;
	private java.time.LocalDate date;
	

}
