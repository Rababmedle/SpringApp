package com.example.BnidarkApp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controllrtest {
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
