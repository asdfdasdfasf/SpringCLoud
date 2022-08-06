package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/22 13:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;

    /**
     * 名称
     */
    private String productName;

    /**
     * 状态
     */
    private int status;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 描述
     */
    private String productDesc;

    /**
     * 标题
     */
    private String caption;

    /**
     * 库存
     */
    private int inventory;
}
