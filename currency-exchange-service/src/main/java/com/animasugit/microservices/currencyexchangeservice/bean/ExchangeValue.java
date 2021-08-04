package com.animasugit.microservices.currencyexchangeservice.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
    
    @Id
    private Long id;

	@Column(name="currency_from")
    private String from;
    
	@Column(name="currency_to")
    private String to;
    
    private BigDecimal conversionMultiple;
    private String environment;

    public ExchangeValue() {
    }

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfrom() {
        return this.from;
    }

    public void setfrom(String from) {
        this.from = from;
    }

    public String getto() {
        return this.to;
    }

    public void setto(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return this.conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

}
