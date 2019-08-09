package com.x.kurt.government.client;

import com.x.kurt.government.client.fallback.GovernmentClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "government-application", fallback = GovernmentClientFallback.class)
public interface GovernmentClient {
    @GetMapping("/government/arrest")
    String arrest(@RequestParam String name);
}
