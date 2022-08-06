package com.example.springbootdemopractice;

import com.example.springbootdemopractice.domain.Car;
import com.example.springbootdemopractice.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.Set;

@SpringBootTest
class SpringBootDemoPracticeApplicationTests {

    @Autowired
    ConfigurableApplicationContext application;
    @Test
    void contextLoads() {
        Map<String, User> beans = application.getBeansOfType(User.class);
        Set<Map.Entry<String, User>> entrySet = beans.entrySet();
        entrySet.forEach((x)->{
            System.out.println(x.getKey()+"-->"+x.getValue());
        });
    }
    @Test
    public void test(){
        Car bean = application.getBean(Car.class);
        System.out.println(bean);
    }

}
