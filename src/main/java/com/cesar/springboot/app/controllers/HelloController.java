package com.cesar.springboot.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/app/hello")
    public Map<String, String> holle (){
        Map<String, String> json = new HashMap<>();
        json.put("Hola", "World");
        return json;
    }
}
