package com.animasugit.microservices.currencyexchangeservice.controller;

import com.animasugit.microservices.currencyexchangeservice.bean.ExchangeValue;
import com.animasugit.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
    @Autowired
    private Environment environment;
    @Autowired
    private CurrencyExchangeRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
  
        ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
        if(exchangeValue == null){
            throw new RuntimeException("Unable to find data for "+from+" to "+to);
        }

        exchangeValue.setEnvironment(environment.getProperty("local.server.port"));
        return exchangeValue;
    }



}
