package com.example.docker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home/controller")
public class Controller1 {

    @GetMapping(value="/cont1")
    public String getHello(){
        return "Hello World";
    }
}
