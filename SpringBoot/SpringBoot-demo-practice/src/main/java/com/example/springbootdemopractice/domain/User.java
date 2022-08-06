package com.example.springbootdemopractice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/16 10:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;
    private String address;
}
