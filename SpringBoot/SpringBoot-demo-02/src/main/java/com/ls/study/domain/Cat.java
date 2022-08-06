package com.ls.study.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/24 22:45
 */
@Component
@Data
public class Cat {
    @Value("汤姆猫")
    private String name;
    @Value("${person.age}")
    private Integer age;
}
