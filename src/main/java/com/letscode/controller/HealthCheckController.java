package com.letscode.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class HealthCheckController {

    @GetMapping("/health-check")
    public String getHealthCheck() {
        return "Shoppers API is up and running.";
    }
}
