package com.example.jenkins.build.demo.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello Rahat!";
    }
}
