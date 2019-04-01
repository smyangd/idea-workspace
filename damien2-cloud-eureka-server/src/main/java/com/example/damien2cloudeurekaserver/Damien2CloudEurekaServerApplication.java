package com.example.damien2cloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //通过@EnableEurekaServer注解启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class Damien2CloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Damien2CloudEurekaServerApplication.class, args);
	}

}

