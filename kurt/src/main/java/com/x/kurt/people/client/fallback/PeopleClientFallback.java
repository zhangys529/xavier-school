package com.x.kurt.people.client.fallback;

import com.x.kurt.people.client.PeopleClient;
import org.springframework.stereotype.Component;

@Component
public class PeopleClientFallback implements PeopleClient {
    @Override
    public String hello(String name) {
        return "fuck you!";
    }
}
