package com.diplomado.k8s.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
    System.out.println("Hello World!!");
    return "Hola mundo!";
    }
    @GetMapping("/bye")
    public String Goodbye() {
        System.out.println("Goodbye!");
        return "Goodbye!!";
    }



}
