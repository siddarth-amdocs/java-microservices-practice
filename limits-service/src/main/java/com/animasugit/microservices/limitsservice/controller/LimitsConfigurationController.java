package com.animasugit.microservices.limitsservice.controller;

import com.animasugit.microservices.limitsservice.bean.Limits;
import com.animasugit.microservices.limitsservice.config.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMaximum(),configuration.getMinimum());
    }
}
