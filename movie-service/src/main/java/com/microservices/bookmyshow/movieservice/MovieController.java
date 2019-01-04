package com.microservices.bookmyshow.movieservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	
	@Autowired
	MovieRepository  movieRepo;
	
	@GetMapping("/movies/{movieName}")
	public Movie getMovies(@PathVariable String movieName) {
		return movieRepo.findByMovieName(movieName);
	}

}
