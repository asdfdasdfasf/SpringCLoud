package com.kyrie.study.vo;

import com.kyrie.study.pojo.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 15:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductVo {
    /**
     * 主键
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
}
