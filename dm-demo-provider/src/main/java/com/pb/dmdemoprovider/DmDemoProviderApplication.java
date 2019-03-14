package com.pb.dmdemoprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DmDemoProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmDemoProviderApplication.class, args);
    }

}
