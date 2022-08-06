package com.example.springbootdemoadmin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/3 21:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer dId;
    private String dName;
}
