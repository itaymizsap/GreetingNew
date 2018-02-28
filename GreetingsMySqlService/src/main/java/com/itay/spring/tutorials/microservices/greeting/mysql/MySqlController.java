package com.itay.spring.tutorials.microservices.greeting.mysql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySqlController {

    @GetMapping("/")
    public String landingPage() {
        return "Welcome to GreetingDB on MySQL";
    }
}
