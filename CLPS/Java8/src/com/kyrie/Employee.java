package com.kyrie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/24 16:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
}
