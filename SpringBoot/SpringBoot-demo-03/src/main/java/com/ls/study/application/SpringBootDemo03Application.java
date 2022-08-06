package com.ls.study.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemo03Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootDemo03Application.class, args);
    }
}
