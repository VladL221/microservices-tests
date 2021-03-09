package com.landau.microservices.limitservice2.controllers;

import com.landau.microservices.limitservice2.beans.Limit;
import com.landau.microservices.limitservice2.config.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitServiceController {

    private final Configuration configuration;


    @GetMapping("/limits2")
        public Limit retrieveLimits(){
        return new Limit(configuration.getMin(),configuration.getMax());
    }



}
