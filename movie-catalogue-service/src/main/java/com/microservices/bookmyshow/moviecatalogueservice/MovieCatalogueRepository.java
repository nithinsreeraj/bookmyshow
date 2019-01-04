package com.microservices.bookmyshow.moviecatalogueservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieCatalogueRepository extends JpaRepository<MovieCatalogue, Integer> {

	public List<MovieCatalogue> findByCityId(int cityId);
}
