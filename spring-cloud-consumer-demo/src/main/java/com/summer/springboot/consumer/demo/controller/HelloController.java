package com.summer.springboot.consumer.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RefreshScope
@RestController
public class HelloController {
    @Resource
    private RestTemplate restTemplate;


    @Value("${level}")
    private String level;

    @RequestMapping(value = "/hello")
    public String hello() {
        return restTemplate.getForEntity("http://spring-cloud-service-demo/hello", String.class).getBody();
    }

    @RequestMapping("/level")
    public String level() {
        return level;
    }
}
