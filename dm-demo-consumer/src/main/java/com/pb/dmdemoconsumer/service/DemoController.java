package com.pb.dmdemoconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @Autowired
    private FeignDemoService feignDemoService;

    @GetMapping("/login5")
    public String login() {
        for (int i = 0;i < 10;i++){
            feignDemoService.login(i);
        }
        return "ribbon负载";
    }

    //eureka单个参数传递
    @PostMapping("/login")
    public String login(@RequestParam("name") String name){
        if (feignDemoService.login(name)){
            return "<h1>"+name+"登录成功</h1>";
        }
        return "<h1>"+name+"登录失败</h1>";
    }

    //eureka多个参数传递
    @PostMapping("/login2")
    public String login(@RequestParam("name") String name,@RequestParam("pwd") String pwd){
        Map map = new HashMap();
        map.put("name",name);
        map.put("pwd",pwd);
        if (feignDemoService.login(map)){
            return "<h1>"+name+"登录成功</h1>";
        }
        return "<h1>"+name+"登录失败</h1>";
    }

    @GetMapping("/login3")
    public String login2(@RequestParam("name") String name){
        String result = feignDemoService.login2(name);
        return result;
    }
}
