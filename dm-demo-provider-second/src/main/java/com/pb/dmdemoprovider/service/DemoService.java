package com.pb.dmdemoprovider.service;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class DemoService {

    @GetMapping("/login5")
    public String login(@RequestParam("count") int count){
        System.out.println("count"+count+"-->当前服务是:18083");
        return "登录验证";
    }

    @PostMapping("/login")
    public Boolean login(@RequestParam("name") String name){
        return "Feign".equals(name);
    }

    @PostMapping("/login2")
    public Boolean login(@RequestBody Map demoMap){
        String name = (String) demoMap.get("name");
        String pwd = (String) demoMap.get("pwd");
        return "Feign".equals(name) && "root".equals(pwd);
    }

    @GetMapping("/login3")
    public String login2(@RequestParam("name") String name){
        return "你好"+name+",请求失败,请稍后再试";
    }

    @GetMapping("/login4")
    public String loginSecond(@RequestParam("name") String name){
        return "你好"+name;
    }
}
