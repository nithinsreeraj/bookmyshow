package com.microservices.bookmyshow.theatrecatalogueservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TheatreCatalogueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheatreCatalogueServiceApplication.class, args);
	}

}

