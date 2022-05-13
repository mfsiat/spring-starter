package com.example.springstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api")
    public String index()
    {
        return "Hello Root";
    }
}