package com.myprojects.swaggerDemo.resources;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
public class HElloResource {

    @GetMapping
    public String hello(){
        return "hello world";
    }
    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello){
        return hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello){
        return hello;
    }
}
