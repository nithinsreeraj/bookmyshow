package com.microservices.bookmyshow.moviecatalogueservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieCatalogueController {
	
	@Autowired
	MovieCatalogueRepository movieRepo;
	
	@GetMapping("/{cityId}/movies")
	public List<MovieCatalogue> getMovies(@PathVariable int cityId) {
		return movieRepo.findByCityId(cityId);
	}
	
}
