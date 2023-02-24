package com.capg;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@RestController

public class MultiplexBookingSystemApplication {
		@GetMapping("/message")
		public String getMessage() {
			return "Welcome to MultiplexBookingSystem";
		}

	public static void main(String[] args) {
		SpringApplication.run(MultiplexBookingSystemApplication.class, args);
		System.out.println("Hello");
	}

}
