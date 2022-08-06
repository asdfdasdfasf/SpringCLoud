package com.kyrie.study.service;

import com.kyrie.study.common.CommonResult;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 19:22
 */
public interface CommentService {

    /**
     * 获取评论
     * @param id
     * @param number
     * @return
     */
    CommonResult getCommentList(int id, int number);
}
