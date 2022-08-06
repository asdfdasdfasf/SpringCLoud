package com.ls.study.application.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/25 20:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ConfigurationProperties(prefix = "teacher")
public class Teacher {
    private String name;
    private Integer age;
}
