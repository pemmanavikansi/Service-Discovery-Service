package com.example.servicediscoveryserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eurekaserver")
public class EurekaServerController {
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to eureka server";
    }
}
