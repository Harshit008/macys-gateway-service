package com.zensar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/producerServiceFallBack")
	public String producerServiceFallBack() {
		return "Producer service is currently down!!";
	}
	
	@GetMapping("/consumerServiceFallBack")
	public String consumerServiceFallBack() {
		return "Consumer service is currently down!!";
	}
	
	@GetMapping("/orderServiceFallBack")
	public String orderServiceFallBack() {
		return "Order service is currently down!!";
	}
}
