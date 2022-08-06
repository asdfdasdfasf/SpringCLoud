package com.ls.study.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/24 22:01
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;
    private List<Integer> list;
}
