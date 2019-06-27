package com.summer.springboot.consumer.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hello")
    public String hello() {
        return restTemplate.getForEntity("http://spring-cloud-service-demo/hello", String.class).getBody();
    }
}
