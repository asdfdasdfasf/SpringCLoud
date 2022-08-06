package com.kyrie.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/5 10:18
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain80zk {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain80zk.class,args);
    }
}
