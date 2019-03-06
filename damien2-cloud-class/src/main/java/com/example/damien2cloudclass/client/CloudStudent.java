package com.example.damien2cloudclass.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("cloud-student")
public interface CloudStudent {

    @GetMapping("/dc")
    String consumer();

}
