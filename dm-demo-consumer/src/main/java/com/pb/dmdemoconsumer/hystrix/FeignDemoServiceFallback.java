package com.pb.dmdemoconsumer.hystrix;

import com.pb.dmdemoconsumer.service.FeignDemoService;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class FeignDemoServiceFallback implements FeignDemoService {
    /*@Override
    public String login() {
        return "请求失败";
    }*/

    @Override
    public String login(int count) {
        System.out.println("count"+count+"-->当前服务是:18083");
        return "登录验证";
    }

    @Override
    public Boolean login(String name) {
        return false;
    }

    @Override
    public Boolean login(Map demoMap) {
        return false;
    }

    @Override
    public String login2(String name) {
        return "你好"+name+",请求失败,请稍后再试";
    }

    @Override
    public String loginSecond(String name) {
        return "你好"+name;
    }
}
