package com.microservices.bookmyshow.moviecatalogueservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieCatalogue {

	@Id
	@Column(name="movie_catalogue_id")
	private int movieCatalogueId;
	
	@Column(name="movie_id")
	private int movieId;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="language")
	private String language;
	
	public MovieCatalogue() {
		
	}
		
	public MovieCatalogue(int movieCatalogueId, int movieId, String movieName, int cityId, String language) {
		super();
		this.movieCatalogueId = movieCatalogueId;
		this.movieId = movieId;
		this.movieName = movieName;
		this.cityId = cityId;
		this.language = language;
	}
	
	public int getMovieCatalogueId() {
		return movieCatalogueId;
	}

	public void setMovieCatalogueId(int movieCatalogueId) {
		this.movieCatalogueId = movieCatalogueId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}

