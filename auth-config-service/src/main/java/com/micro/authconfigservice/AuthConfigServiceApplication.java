package com.micro.authconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuthConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthConfigServiceApplication.class, args);
	}

}

