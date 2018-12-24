package com.microservices.bookmyshow.premierecatalogueservice.dto;

import java.util.List;

public class ShowTimings {
	
	private int theatreId;
	private String theatreName;
	private List<Shows> shows;
	
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
	public List<Shows> getShows() {
		return shows;
	}
	public void setShows(List<Shows> shows) {
		this.shows = shows;
	}

}
