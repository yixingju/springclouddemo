package com.pb.dmdemoconsumersecond.service;

import com.pb.dmdemoconsumersecond.hystrix.FeignDemoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "dm-demo-provider",fallback = FeignDemoServiceFallback.class)
public interface FeignDemoService {

    /*@GetMapping("/login")
    String login();*/

    @PostMapping("login")
    Boolean login(@RequestParam("name") String name);

    @PostMapping("/login2")
    Boolean login(@RequestBody Map demoMap);

    @GetMapping("/login")
    String login2(@RequestParam("name") String name);

    @GetMapping("/login4")
    String loginSecond(@RequestParam("name") String name);
}
