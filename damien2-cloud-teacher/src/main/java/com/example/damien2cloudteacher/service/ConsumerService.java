package com.example.damien2cloudteacher.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

        @Autowired
        RestTemplate restTemplate;

        @HystrixCommand(fallbackMethod = "fallback")
        public String cloudTeacherHystrixConsumer() {

            return restTemplate.getForObject("http://cloud-student/dc", String.class);
        }

        public String fallback() {
            return "fallback";
        }

    }