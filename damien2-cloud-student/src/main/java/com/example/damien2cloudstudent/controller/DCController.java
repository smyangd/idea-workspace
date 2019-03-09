package com.example.damien2cloudstudent.controller;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DCController {

    @Autowired
    DiscoveryClient discoveryClient;

    @ApiOperation(value="服务发现", notes="获取当前注册中心所有的服务")
    //@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")

    @GetMapping("/dc")
    public String dc() throws InterruptedException{
        Thread.sleep(5000L);  //此配置是为了测试服务熔断的超时代码
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    /**
     * 用于测试zuul-gateway服务网关的功能
     * */
    @GetMapping("/dc2")
    public String dc2() throws InterruptedException{
        //Thread.sleep(5000L);  //此配置是为了测试服务熔断的超时代码
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }


}
