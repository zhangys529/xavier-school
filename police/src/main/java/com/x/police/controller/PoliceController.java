package com.x.police.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/police")
public class PoliceController {
    @GetMapping("/obey")
    @ApiOperation(value = "obey")
    public String obey(@RequestParam String orders) {
        String obey = String.format("obey %s.", orders);
        log.debug(obey);
        return obey;
    }
}
