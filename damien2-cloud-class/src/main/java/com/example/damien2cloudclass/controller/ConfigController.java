package com.example.damien2cloudclass.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${id}")
    private String id;

    @Value("${name}")
    private String name;

    @Value("${age}")
    private String age;

    @GetMapping("config")
    public String config(){
        return id+" "+name+" "+age;
    }
}
