package com.microservices.bookmyshow.premierecatalogueservice;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.bookmyshow.premierecatalogueservice.dto.ShowFilterDTO;
import com.microservices.bookmyshow.premierecatalogueservice.dto.ShowTimings;

@RestController
public class ShowController {

	@PostMapping("/shows")
	public List<ShowTimings> getShows(ShowFilterDTO filterDTO){
		return null;
		
	}
}
