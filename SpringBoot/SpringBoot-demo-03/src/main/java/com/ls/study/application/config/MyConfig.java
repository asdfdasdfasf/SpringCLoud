package com.ls.study.application.config;

import com.ls.study.application.domain.Teacher;
import com.ls.study.application.domain.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/25 20:11
 */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(Teacher.class)
public class MyConfig {
    @Bean
    public User user1(){
        return new User("lisi",18);
    }
}
