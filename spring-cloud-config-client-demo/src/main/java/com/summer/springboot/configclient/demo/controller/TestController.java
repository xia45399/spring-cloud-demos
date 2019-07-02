package com.summer.springboot.configclient.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Value("${desc}")
    private String desc;

    @RequestMapping("/getDesc")
    public String getDesc() {
        return desc;
    }
}
