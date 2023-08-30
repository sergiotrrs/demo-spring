package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String greeting(){
        return "Hello render";
    }

}