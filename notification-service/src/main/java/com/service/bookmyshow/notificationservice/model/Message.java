package com.service.bookmyshow.notificationservice.model;

public class Message {
	
	private int userId;
	
	private String message;

	public Message(String message, int userId) {
		super();
		this.message = message;
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public Message() {
		
	}
}
