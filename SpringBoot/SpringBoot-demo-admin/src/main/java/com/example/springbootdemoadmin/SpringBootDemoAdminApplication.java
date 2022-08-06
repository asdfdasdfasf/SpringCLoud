package com.example.springbootdemoadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "com.example.springbootdemoadmin.servlet")
@SpringBootApplication
public class SpringBootDemoAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoAdminApplication.class, args);
    }

}
