package com.example.damien2cloudclass.controller;

import com.example.damien2cloudclass.client.CloudStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    CloudStudent cloudStudent;

    @GetMapping("/feign-consumer")
    public String dc() {
        return cloudStudent.consumer();
    }
}
