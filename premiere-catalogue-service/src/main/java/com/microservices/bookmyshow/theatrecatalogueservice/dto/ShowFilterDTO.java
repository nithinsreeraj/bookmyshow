package com.microservices.bookmyshow.theatrecatalogueservice.dto;

public class ShowFilterDTO {
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public java.time.LocalDateTime getShowDateTime() {
		return showDateTime;
	}
	public void setShowDateTime(java.time.LocalDateTime showDateTime) {
		this.showDateTime = showDateTime;
	}
	private int movieId;
	private int cityId;
	private java.time.LocalDateTime showDateTime;
	

}
