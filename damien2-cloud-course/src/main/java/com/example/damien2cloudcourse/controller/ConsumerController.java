package com.example.damien2cloudcourse.controller;

import com.example.damien2cloudcourse.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/ribbon-consumer")
    public String dc() {
        return restTemplate.getForObject("http://cloud-student/dc", String.class);
    }

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/cloud-course-hystrix-consumer")
    public String cloudCourseHystrixConsumer() {
        return consumerService.cloudCourseHystrixConsumer();
    }

}
