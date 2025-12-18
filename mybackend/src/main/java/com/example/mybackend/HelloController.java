package com.example.mybackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Java Backend Application! The application is running successfully.";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from the Java backend! This endpoint is working correctly.";
    }

    @GetMapping("/api/status")
    public String status() {
        return "Application Status: Running\nTimestamp: " + java.time.LocalDateTime.now();
    }
}
