package com.kyrie.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/5 11:34
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8004Consul{
    public static void main(String[] args) {
        SpringApplication.run(Payment8004Consul.class,args);
    }
}
