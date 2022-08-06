package com.kyrie.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/22 12:25
 */
@SpringBootApplication
@EnableEurekaServer //代表我这个是服务的注册中心
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
