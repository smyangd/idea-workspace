package com.example.damien2cloudconfigservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Damien2CloudConfigServerGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(Damien2CloudConfigServerGitApplication.class, args);
	}

}
