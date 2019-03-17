package com.example.damien2cloudteacher.controller;

import com.example.damien2cloudteacher.service.ConsumerService;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;

    @ApiOperation(value="basic-consumer", notes="")
    //@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @GetMapping("/basic-consumer")
    public String dc() {
        logger.info("===cloud-teacher basic-consumer===");
        ServiceInstance serviceInstance = loadBalancerClient.choose("cloud-student");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
        //System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }



    @Autowired
    ConsumerService consumerService;

    @ApiOperation(value="cloud-teacher-hystrix-consumer", notes="")
    //@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @GetMapping("/cloud-teacher-hystrix-consumer")
    public String cloudTeacherHystrixConsumer() {
        return consumerService.cloudTeacherHystrixConsumer();
    }
}
