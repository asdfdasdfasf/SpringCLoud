package com.kyrie.study.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/13 11:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements Serializable {
    private Integer id;
    private String name;
    private Integer amount;
    private Double price;
}
