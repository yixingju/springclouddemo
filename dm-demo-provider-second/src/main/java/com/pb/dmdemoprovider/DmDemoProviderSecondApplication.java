package com.pb.dmdemoprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DmDemoProviderSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmDemoProviderSecondApplication.class, args);
    }

}
