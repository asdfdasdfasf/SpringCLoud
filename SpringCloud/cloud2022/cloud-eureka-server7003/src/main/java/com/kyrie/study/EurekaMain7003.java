package com.kyrie.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/26 15:25
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7003.class,args);
    }
}
