package com.example.damien2cloudstudent.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

	@Id
	// @GeneratedValue
	private String id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String age;

}
