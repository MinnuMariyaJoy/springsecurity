package com.myprojects.springsecuritydemo.resources;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResources {
    @GetMapping
    public String hello(){
        return "hello world";
    }
}
