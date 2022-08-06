package com.kyrie.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 16:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    /**
     * 主键
     */
    private int id;

    private String username;

    /**
     * 评论
     */
    private String comment;

    /**
     * 点赞数量
     */
    private int start;

    /**
     * 关联货物id
     */
    private int productId;
}
