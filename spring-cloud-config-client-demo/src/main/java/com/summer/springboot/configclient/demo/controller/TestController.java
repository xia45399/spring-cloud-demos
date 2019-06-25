package com.summer.springboot.configclient.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${fileName}")
    private String fileName;

    @RequestMapping("/getFileName")
    public String getFileName() {
        return fileName;
    }
}
