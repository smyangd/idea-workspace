package com.example.damien2cloudzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class Damien2CloudZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Damien2CloudZipkinServerApplication.class, args);
	}

}
