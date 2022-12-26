package com.example.demo;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
    
    @RequestMapping("/")
    public String hola(){
        return "Hola mundo";
    }

    @RequestMapping("/user")
    public ResponseEntity<String> getUser(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Content-Type", "application/json")
                .body("{\"name\": \"marco\"}");

    }

    @RequestMapping("/user2")
    public Map<String, Map<String, Object>> getUser2() {
        return Map.of("user", Map.of("name", "ruben", "age", 22));
    }
}
