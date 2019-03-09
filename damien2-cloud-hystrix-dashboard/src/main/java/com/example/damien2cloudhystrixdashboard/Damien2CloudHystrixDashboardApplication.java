package com.example.damien2cloudhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class Damien2CloudHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(Damien2CloudHystrixDashboardApplication.class, args);
	}

}
