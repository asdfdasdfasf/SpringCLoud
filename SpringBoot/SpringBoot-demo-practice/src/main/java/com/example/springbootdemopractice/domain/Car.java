package com.example.springbootdemopractice.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/16 10:47
 */
//@Component
@ConfigurationProperties(prefix = "car")
@Data
public class Car {
    private String name;
    private Integer number;
    private String brand;
}
