package com.ls.study.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/5 22:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer id;
    private String deptName;
    private Integer manager;
}
