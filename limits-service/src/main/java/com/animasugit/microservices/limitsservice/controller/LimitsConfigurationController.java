package com.animasugit.microservices.limitsservice.controller;

import com.animasugit.microservices.limitsservice.bean.LimitsConfiguration;
import com.animasugit.microservices.limitsservice.config.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations(){
        return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
