package com.x.logan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoganFallbackController {
    @GetMapping("/fallback")
    public String fallback() {
        return "why is the moon so lonely";
    }
}
