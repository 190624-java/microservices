package com.revature.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHotelApplication.class, args);
	}

}
