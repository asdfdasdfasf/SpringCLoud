package com.kyrie.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 15:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Info {
    /**
     * 主键
     */
    private int id;

    /**
     * 日期
     */
    private Date years;

    /**
     * 风格
     */
    private String style;

    /**
     * 类型
     */
    private String type;

    /**
     * 层级
     */
    private String level;

    /**
     * 朝向
     */
    private String orientation;

    /**
     * 关联货物id
     */
    private int product_id;
}
