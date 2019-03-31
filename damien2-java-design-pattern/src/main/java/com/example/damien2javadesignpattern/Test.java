package com.example.damien2javadesignpattern;

import org.apache.ibatis.io.ResolverUtil;

public class Test {

    private String id;
    private String name;
    private String age;
    private String sex;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.setId("");
        test.setName("");
        test.setAge("");
        test.setSex("");
        test.setAddress("");

    }

}
