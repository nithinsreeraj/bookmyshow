package com.microservices.bookmyshow.theatrecatalogueservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.bookmyshow.theatrecatalogueservice.dto.ShowFilterDTO;
import com.microservices.bookmyshow.theatrecatalogueservice.entity.Theatre;
import com.microservices.bookmyshow.theatrecatalogueservice.repo.TheatreRepository;


@RestController
public class ShowController {

	@Autowired TheatreRepository theatreRepo;
	@Autowired EntityManager manager;
	@PostMapping("/shows")
	public List<Theatre> getShows(ShowFilterDTO filterDTO){
		
		StringBuffer buf = new StringBuffer ();
		buf.append(" select t.theatre_id, t.theatre_name, * from theatre t ");
		buf.append(" inner join show sh on sh.theatre_id = t.theatre_id");
		buf.append(" inner join seat s on sh.show_id = s.show_id");
		buf.append(" where 1=1");
		buf.append(" and t.movie_id = " + filterDTO.getMovieId());
		buf.append(" and t.city_id = " + filterDTO.getCityId());
		buf.append(" and sh.show_date_time = " + filterDTO.getShowDateTime());
		
		manager.createQuery(buf.toString()).getResultList();
		
		
		ArrayList<Theatre> theatres = theatreRepo.findByMovieIdAndCityIdAndDate(filterDTO.getMovieId(), filterDTO.getCityId(), filterDTO.getShowDateTime());
//		List<Show> shows = new ArrayList<Show>();
//		Theatre ariesPlex = new Theatre(1, "Aries Plex", shows);
//		theatres.add(ariesPlex);
		return theatres;
		
	}
}
