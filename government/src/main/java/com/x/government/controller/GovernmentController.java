package com.x.government.controller;

import com.x.kurt.people.client.PeopleClient;
import com.x.kurt.police.client.PoliceClient;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class GovernmentController {
    @Autowired
    private PoliceClient policeClient;
    @Autowired
    private PeopleClient peopleClient;

    @GetMapping("/arrest")
    @ApiOperation(value = "arrest")
    public String arrest(@RequestParam String name) {
        log.debug(name);
        String hello = peopleClient.hello(name);
        log.debug("peopleClient:{}", hello);
        String arrest = String.format("arrest %s.", name);
        log.debug(arrest);
        String obey = policeClient.obey(arrest);
        log.debug("policeClient:{}", obey);
        return hello + arrest + obey;
    }
}
