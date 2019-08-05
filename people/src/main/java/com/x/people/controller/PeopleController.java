package com.x.people.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class PeopleController {
    @GetMapping("/hello")
    @ApiOperation(value = "hello")
    public String hello(@RequestParam String name) {
        String hello = String.format("hello %s.", name);
        log.debug(hello);
        return hello;
    }
}
