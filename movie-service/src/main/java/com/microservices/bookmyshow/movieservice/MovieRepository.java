package com.microservices.bookmyshow.movieservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, String>{

	public Movie findByMovieName(String movieName);
}
