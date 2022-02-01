package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix	
public class MacysGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacysGatewayServiceApplication.class, args);
	}

}
