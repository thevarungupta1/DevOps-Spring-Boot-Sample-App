package com.thevarungupta.spring.boot.sample.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping("/home")
    public String getEmployees(){
        return "Hello from Spring Boot Application";
    }
}
