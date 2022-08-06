package com.kyrie.study.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 21:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductSearchVo {
    /**
     * 主键
     */
    private int id;

    /**
     * 标题
     */
    private String title;

    /**
     * 房屋类型
     */
    private String houseType;

    /**
     * 价格
     */
    private String price;

    /**
     * 租赁类型
     */
    private String rentType;

    /**
     * 图片地址
     */
    private String img;
}
