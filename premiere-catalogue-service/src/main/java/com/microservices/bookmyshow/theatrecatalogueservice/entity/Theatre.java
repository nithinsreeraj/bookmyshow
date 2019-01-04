package com.microservices.bookmyshow.theatrecatalogueservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Theatre {
	@Id
	@Column(name="theatre_id")
	private int theatreId;
	@Column(name="theatre_name")
	private String theatreName;
	@Column(name="city_id")
	private int cityId;
	@Column(name="movie_id")
	private int movieId;
	
	public Theatre() {
		
	}
	
	public Theatre(int theatreId, String theatreName, int cityId, int movieId) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.cityId = cityId;
		this.movieId = movieId;
	}

	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	

}
