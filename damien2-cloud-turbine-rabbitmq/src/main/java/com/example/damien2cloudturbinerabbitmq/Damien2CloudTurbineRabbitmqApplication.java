package com.example.damien2cloudturbinerabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;


@EnableTurbine     //在应用主类中使用@EnableTurbineStream注解来启用Turbine Stream的配置。
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient

@SpringBootApplication
public class Damien2CloudTurbineRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(Damien2CloudTurbineRabbitmqApplication.class, args);
	}

}
