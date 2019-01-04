package com.microservices.bookmyshow.reviewservice.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.bookmyshow.reviewservice.entity.Review;
import com.microservices.bookmyshow.reviewservice.entity.ReviewRepository;

@RestController
public class ReviewJPAController {
	
	private double rating;
	private double num;
	
	@Autowired
	private ReviewRepository repository;
	
	@Autowired
	private Review review;
	
	//reviews of a particular movie
	@GetMapping("/movie/{id}/reviews")
	public List<Review> retrieveOneReviews(@PathVariable int id){
		 	return repository.findByMovieIdAndReviewNotNull(id);
	}
	
	//total review count of a movie
	@GetMapping("/movie/{id}/reviews/count")
	public double counts1(@PathVariable int id){
		num=0;
		for(Review review:repository.findByMovieIdAndReviewNotNull(id))
				 num++;
		return num;
	}
	
	//adding a review
	@PostMapping("/movie/{id}/reviews")
	public ResponseEntity<Object> createReview(@Valid @RequestBody Review reviews ,@PathVariable int id) {
		reviews.setMovieId(id);
		review = repository.save(reviews);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//getting the rating of the movie
	@GetMapping("/movie/{id}/rating")
	public double retrieveRating(@PathVariable int id){
		num=0;
		rating=0;
		for(Review review:repository.findByMovieId(id)) {
			rating+=review.getRating();
			num++;
			}
			if(num!=0)
				rating/=num;
		return rating;
	}

}
