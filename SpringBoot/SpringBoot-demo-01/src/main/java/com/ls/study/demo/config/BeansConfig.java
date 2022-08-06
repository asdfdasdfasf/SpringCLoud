package com.ls.study.demo.config;

import com.ls.study.demo.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/23 15:38
 * proxyBeanMethods的值默认是true，表示使用的是Full模式，组件之间是单实例的，方法调用之间组件是可以相互依赖的
 * proxyBeanMethods：false表示使用的是Lite模式，每次方法调用都是创建一个新的实例组件
 */
@Configuration(proxyBeanMethods = false)
public class BeansConfig {
    @Bean("myStudent")
    public Student student(){
        return new Student(18,"欧文");
    }
}
