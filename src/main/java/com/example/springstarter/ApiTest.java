package com.example.springstarter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiTest")
public class ApiTest {
    @RequestMapping("")
    public String index()
    {
        return "Hello Api";
    }
}