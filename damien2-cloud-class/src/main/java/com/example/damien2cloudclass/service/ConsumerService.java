package com.example.damien2cloudclass.service;

import com.example.damien2cloudclass.client.CloudStudent;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

        @Autowired
        CloudStudent cloudStudent;

        // 需要在启动类加注解
        @HystrixCommand(fallbackMethod = "fallback")
        public String cloudClassHystrixConsumer() {
            return cloudStudent.consumer();
        }

        public String fallback() {
            return "fallback";
        }

    }