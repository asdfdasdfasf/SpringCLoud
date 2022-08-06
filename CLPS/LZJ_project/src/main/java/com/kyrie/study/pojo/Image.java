package com.kyrie.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 16:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    /**
     * 主键id
     */
    private int id;

    /**
     * 图片地址
     */
    private String url;

    /**
     * 关联商品id
     */
    private int productId;
}
