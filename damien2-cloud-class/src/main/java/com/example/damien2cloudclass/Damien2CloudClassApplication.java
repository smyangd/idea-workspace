package com.example.damien2cloudclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Damien2CloudClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(Damien2CloudClassApplication.class, args);
	}

}
