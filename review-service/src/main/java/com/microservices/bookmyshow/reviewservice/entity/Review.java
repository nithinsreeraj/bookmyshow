package com.microservices.bookmyshow.reviewservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Review {
	
	@Id
	@GeneratedValue
	public Integer reviewId;
	public Integer movieId;
	public Integer userId;	

	@Column(columnDefinition = "TEXT")
	private String review;
	private Integer likes; 
	private Integer dislikes;
	
	@Min(1)
	@Max(5)
	private Integer rating;
	private boolean validated;
	private Date date;
	
	
	public Review() {
		// TODO Auto-generated constructor stub
	}


	public Review(Integer reviewId, Integer movieId, Integer userId, String review, Integer likes, Integer dislikes,
			Integer rating, boolean validated, Date date) {
		super();
		this.reviewId = reviewId;
		this.movieId = movieId;
		this.userId = userId;
		this.review = review;
		this.likes = likes;
		this.dislikes = dislikes;
		this.rating = rating;
		this.validated = validated;
		this.date = date;
	}


	public Integer getReviewId() {
		return reviewId;
	}


	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}


	public Integer getMovieId() {
		return movieId;
	}


	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getReview() {
		return review;
	}


	public void setReview(String review) {
		this.review = review;
	}


	public Integer getLikes() {
		return likes;
	}


	public void setLikes(Integer likes) {
		this.likes = likes;
	}


	public Integer getDislikes() {
		return dislikes;
	}


	public void setDislikes(Integer dislikes) {
		this.dislikes = dislikes;
	}


	public Integer getRating() {
		return rating;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
	}


	public boolean isValidated() {
		return validated;
	}


	public void setValidated(boolean validated) {
		this.validated = validated;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", movieId=" + movieId + ", userId=" + userId + ", review=" + review
				+ ", likes=" + likes + ", dislikes=" + dislikes + ", rating=" + rating + ", validated=" + validated
				+ ", date=" + date + "]";
	}


}