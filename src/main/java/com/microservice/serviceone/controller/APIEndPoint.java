package com.microservice.serviceone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class APIEndPoint {
    @GetMapping("testS1")
    public String testEndpoint(){
        return "from service one";
    }
}
