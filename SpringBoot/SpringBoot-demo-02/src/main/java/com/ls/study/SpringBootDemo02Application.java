package com.ls.study;

import com.ls.study.domain.Cat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemo02Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootDemo02Application.class, args);
        Cat bean = run.getBean(Cat.class);
        System.out.println(bean);
    }

}










































































































