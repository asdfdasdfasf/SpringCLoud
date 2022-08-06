package com.kyrie.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/6 9:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment80Consul {
    public static void main(String[] args) {
        SpringApplication.run(Payment80Consul.class,args);
    }
}
