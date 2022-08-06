package com.example.springbootdemoadmin.config;

import com.example.springbootdemoadmin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/30 11:13
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                //默认拦截所有的请求路径,同时也拦截了静态资源
                .addPathPatterns("/**")
                //放行登录页面
                .excludePathPatterns("/","/login")
                //放行所有的静态资源文件
                .excludePathPatterns("/css/**","/fonts/**","/images/**","/js/**");
    }
}
