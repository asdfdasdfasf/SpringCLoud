package com.ls.study.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/23 15:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private  Integer age;
    private String name;
}
