package com.wannacode.bookingmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableCircuitBreaker
@EnableFeignClients
public class BookingMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingMicroserviceApplication.class, args);
	}

}
