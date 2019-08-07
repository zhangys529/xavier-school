package com.x.kurt.people.client;

import com.x.kurt.people.client.fallback.PeopleClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "x-people", fallback = PeopleClientFallback.class)
public interface PeopleClient {
    @GetMapping("/people/hello")
    String hello(@RequestParam String name);
}
