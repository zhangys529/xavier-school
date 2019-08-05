package com.x.kurt.police.client.fallback;

import com.x.kurt.police.client.PoliceClient;
import org.springframework.stereotype.Component;

@Component
public class PoliceClientFallback implements PoliceClient {
    @Override
    public String obey(String orders) {
        return "i quit.";
    }
}
