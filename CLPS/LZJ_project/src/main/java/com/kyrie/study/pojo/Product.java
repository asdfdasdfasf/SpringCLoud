package com.kyrie.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 15:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    /**
     * 主键id
     */
    private int id;

    /**
     * 标题
     */
    private String title;

    /**
     * 图片地址
     */
    private String img;
    /**
     * 链接地址
     */
    private String link;

    /**
     * 是否是热门推荐商品，1代表是，0代表不是
     */
    private int isHot;

    /**
     * 城市
     */
    private String city;

    /**
     * 销售数量
     */
    private int saleCount;

    /**
     * 售卖价格
     */
    private BigDecimal price;

    /**
     * 租赁类型
     */
    private String rentType;

    /**
     * 房屋面积
     */
    private String houseType;

    /**
     * 关联物品信息id
     */
    private int productInfoId;

    /**
     * 详情图片地址
     */
    private List<Image> url;
}
