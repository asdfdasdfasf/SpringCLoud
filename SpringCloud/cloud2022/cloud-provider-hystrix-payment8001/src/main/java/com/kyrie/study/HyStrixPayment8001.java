package com.kyrie.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/30 16:46
 */
@SpringBootApplication
@EnableEurekaClient
public class HyStrixPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(HyStrixPayment8001.class,args);
    }
}
