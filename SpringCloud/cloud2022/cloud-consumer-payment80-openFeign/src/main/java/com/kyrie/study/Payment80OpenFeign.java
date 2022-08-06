package com.kyrie.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/25 13:36
 */
@SpringBootApplication
@EnableFeignClients
public class Payment80OpenFeign {
    public static void main(String[] args) {
        SpringApplication.run(Payment80OpenFeign.class,args);
    }
}
