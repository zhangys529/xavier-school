package com.x.kurt.police.client;

import com.x.kurt.police.client.fallback.PoliceClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "x-police", fallback = PoliceClientFallback.class)
public interface PoliceClient {
    @GetMapping("/obey")
    String obey(@RequestParam String orders);
}
