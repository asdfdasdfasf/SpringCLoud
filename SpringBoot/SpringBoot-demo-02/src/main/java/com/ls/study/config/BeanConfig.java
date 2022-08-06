package com.ls.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/24 20:54
 */
@Configuration
public class BeanConfig {
    @Bean
    public Date getDateTime(){
        return new Date();
    }
}
