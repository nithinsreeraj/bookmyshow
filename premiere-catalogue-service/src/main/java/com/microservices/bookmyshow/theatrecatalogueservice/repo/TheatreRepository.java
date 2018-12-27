package com.microservices.bookmyshow.theatrecatalogueservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.bookmyshow.theatrecatalogueservice.entity.Theatre;


public interface TheatreRepository extends JpaRepository<Theatre, Integer>{
	
	//ArrayList<Theatre> findByMovieIdAndCityIdAndDate(int movieId, int cityId, java.time.LocalDateTime showDateTime );


}
