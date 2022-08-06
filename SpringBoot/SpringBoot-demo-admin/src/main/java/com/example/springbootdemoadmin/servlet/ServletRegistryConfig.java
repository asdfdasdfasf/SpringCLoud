package com.example.springbootdemoadmin.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/3 10:56
 */
@Configuration(proxyBeanMethods = true)
public class ServletRegistryConfig {
    @Bean
    public ServletRegistrationBean myServlet(){
        MyServlet servlet=new MyServlet();
        return new ServletRegistrationBean<>(servlet,"/my");
    }

    @Bean
    public FilterRegistrationBean myFilter(){
        MyFilter filter=new MyFilter();
        return new FilterRegistrationBean(filter,myServlet());
    }
    @Bean
    public ServletListenerRegistrationBean myListener(){
        MyListener listener=new MyListener();
        return new ServletListenerRegistrationBean(listener);
    }
}
