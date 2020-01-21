package com.summer.springboot.service.demo;

import com.summer.springboot.service.demo.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceDemo {
    @Resource
    private HelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(ServiceDemo.class, args);
    }

}
