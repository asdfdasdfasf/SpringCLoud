package com.example.springbootdemopractice.config;

import com.example.springbootdemopractice.domain.Car;
import com.example.springbootdemopractice.domain.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/16 10:33
 */
@Configuration
@ImportResource(locations = "classpath:Spring.xml")
@EnableConfigurationProperties(Car.class)
@Import(User.class)
public class BeanConfig {

}
