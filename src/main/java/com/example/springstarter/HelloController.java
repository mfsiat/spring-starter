package com.example.springstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
//    @GetMapping("/")
    @RequestMapping("")
    public String index()
    {
        return "Hello Root";
    }
    @RequestMapping("/apiTest")
    public String apiTest(){
        return "This is an API";
    }
}