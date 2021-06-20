package com.myprojects.swagger.Resources;


import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/add")
    public String helloPost(@RequestBody final String hello){
        return hello;
    }

    @PutMapping("/put")
    public String HelloPut(@RequestBody final  String hello){
        return hello;
    }
}
