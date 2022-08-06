package com.kyrie.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 12:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Banner {
//    /**
//     * 主键
//     */
//    private int id;

    /**
     * 图片地址
     */
    private String url;
}
