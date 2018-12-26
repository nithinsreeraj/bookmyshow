package com.micro.zuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayServerApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}

