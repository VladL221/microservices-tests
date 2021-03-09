package com.landau.microservices.limitsservice.controllers;


import com.landau.microservices.limitsservice.beans.Limits;
import com.landau.microservices.limitsservice.config.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsController {

    // @Autowired
    private final Configuration configuration;




    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
//        return new Limits(1,1000);
    }

}
