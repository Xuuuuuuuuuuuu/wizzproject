package com.example.springboot_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringxuController {

    @GetMapping("/xu")

    public String helloxu(){
        return "hello xu,hello spring!";
    }
}
