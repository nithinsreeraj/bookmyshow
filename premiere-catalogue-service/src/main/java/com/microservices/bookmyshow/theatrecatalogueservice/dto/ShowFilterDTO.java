package com.microservices.bookmyshow.theatrecatalogueservice.dto;

public class ShowFilterDTO {
	
	
	private int movieId;
	private int cityId;
	
	
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
	
	

}
