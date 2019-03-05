package com.example.damien2cloudstudent.service;

import com.example.damien2cloudstudent.entitys.Student;

public interface StudentService {
	
	/**
     * 新增一个用户
     * @param name
     * @param age
     */
    void create(String id, String name, String age);

    /**
     * 根据name删除一个用户高
     * @param name
     */
    void deleteByName(String name);
    
    /**
     * 根据name删除一个用户高
     * @param name
     */
    Student findByName(String name);

    /**
     * 获取用户总量
     */
    Integer getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();
}
