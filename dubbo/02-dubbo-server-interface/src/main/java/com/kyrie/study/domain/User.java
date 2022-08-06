package com.kyrie.study.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/10 16:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String name;
    private Integer age;
    private String email;
    private Map<String,Object> interests;
}
