package com.x.kurt.government.client.fallback;

import com.x.kurt.government.client.GovernmentClient;
import org.springframework.stereotype.Component;

@Component
public class GovernmentClientFallback implements GovernmentClient {
    @Override
    public String arrest(String name) {
        return "love people.";
    }
}
