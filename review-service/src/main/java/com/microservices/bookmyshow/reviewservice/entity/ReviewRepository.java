package com.microservices.bookmyshow.reviewservice.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{
	
	public List<Review> findByMovieIdAndReviewNotNull(int movieId);
	public List<Review> findByMovieId(int movieId);
}
