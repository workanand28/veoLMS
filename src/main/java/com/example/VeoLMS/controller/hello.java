package com.example.VeoLMS.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {


    @GetMapping("/api/hello")
    public helloResponse hello() {
        return new helloResponse("Welcome to the VeoLMS Platfrom");
    }
}
