package com.pb.dmgatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class DmGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmGatewayZuulApplication.class, args);
    }

}
