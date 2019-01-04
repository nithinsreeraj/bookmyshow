package com.microservices.bookmyshow.theatrecatalogueservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.microservices.bookmyshow.theatrecatalogueservice.entity.Show;

public interface ShowRepository extends JpaRepository<Show, Long>{
	
	@Query(" select showId, theatreId, showDateTime, totalSeats, availableSeats from Show s where s.theatreId = :theatreId")
	public List<Show> getShowList(@Param("theatreId") int theatreId);

	public List<Show> findByTheatreId(int theatreId);

}
