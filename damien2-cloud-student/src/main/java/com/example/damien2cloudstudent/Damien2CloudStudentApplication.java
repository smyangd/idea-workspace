package com.example.damien2cloudstudent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.damien2cloudstudent.mapper")
public class Damien2CloudStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(Damien2CloudStudentApplication.class, args);
	}

}
