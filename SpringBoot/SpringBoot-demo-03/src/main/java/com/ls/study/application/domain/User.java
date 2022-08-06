package com.ls.study.application.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/25 17:30
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
}
