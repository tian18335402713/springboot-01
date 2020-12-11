package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

     @RequestMapping("/he")
    public String hello(){
         return "蓝胤桂123";
     }

}
