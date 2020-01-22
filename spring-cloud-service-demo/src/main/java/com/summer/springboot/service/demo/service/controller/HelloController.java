package com.summer.springboot.service.demo.service.controller;

import com.summer.springboot.service.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping()
public class HelloController {
    @Resource
    private HelloService helloService;

    @RequestMapping("hello")
    public String hello() {
        return helloService.hello();
    }

    @Value("${level}")
    private String level;

    @RequestMapping("/level")
    public String level() {
        return level;
    }
}
