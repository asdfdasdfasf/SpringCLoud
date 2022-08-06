package com.kyrie.study.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/22 11:20
 */
@Configuration
public class ApplicationConfig {
    /**
     * 加载RestTemplate 对象
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate template(){
        return new RestTemplate();
    }
}
