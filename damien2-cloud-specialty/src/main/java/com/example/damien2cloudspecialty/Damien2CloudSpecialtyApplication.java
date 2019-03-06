package com.example.damien2cloudspecialty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Damien2CloudSpecialtyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Damien2CloudSpecialtyApplication.class, args);
	}

}
