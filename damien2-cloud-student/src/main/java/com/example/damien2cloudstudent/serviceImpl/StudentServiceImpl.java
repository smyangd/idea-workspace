package com.example.damien2cloudstudent.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.damien2cloudstudent.entitys.Student;
import com.example.damien2cloudstudent.mapper.StudentMapper;
import com.example.damien2cloudstudent.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
    private StudentMapper studentMapper;

	
	@Override
	public void create(String id, String name, String age) {
		studentMapper.insert(id, name, age);
		
	}

	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student findByName(String name) {
		return studentMapper.findByName(name);
	}

}