package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TestController {

    @GetMapping("/sayHello")
    public String sayHello()
    {
        System.out.println("Hello World!");
        return "Hello";
    }
}
