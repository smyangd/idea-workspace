package com.example.damien2java.test;

import com.alibaba.fastjson.JSON;

public class dasdasd {



    public static void main(String[] args) {

        student student = new student();
        student.setAge("231231");
        student.setName("dsadasdas");


        System.out.println(JSON.toJSONString(student));


    }
}
