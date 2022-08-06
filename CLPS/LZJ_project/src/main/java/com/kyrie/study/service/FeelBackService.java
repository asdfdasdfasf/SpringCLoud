package com.kyrie.study.service;

import com.kyrie.study.common.CommonResult;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/31 16:31
 */
public interface FeelBackService {

    CommonResult feelBack(int orderId, String feelBack);
}
