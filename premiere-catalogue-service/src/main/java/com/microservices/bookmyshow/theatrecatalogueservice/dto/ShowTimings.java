package com.microservices.bookmyshow.theatrecatalogueservice.dto;

import java.util.List;

public class ShowTimings {
	
	private int theatreId;
	private String theatreName;
	private List<Show> shows;
	
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
	public List<Show> getShows() {
		return shows;
	}
	public void setShows(List<Show> shows) {
		this.shows = shows;
	}

}
