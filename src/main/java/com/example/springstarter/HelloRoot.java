package com.example.springstarter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-test")
public class HelloRoot {
    @RequestMapping("")
    public String index()
    {
        return "1+1";
    }
}