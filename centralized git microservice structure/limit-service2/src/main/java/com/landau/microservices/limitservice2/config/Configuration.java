package com.landau.microservices.limitservice2.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service2")
@Data
public class Configuration {

    private int min;

    private int max;

}
