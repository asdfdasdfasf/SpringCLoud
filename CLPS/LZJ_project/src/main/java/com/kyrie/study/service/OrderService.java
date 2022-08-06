package com.kyrie.study.service;

import com.kyrie.study.common.CommonResult;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 20:12
 */
public interface OrderService {

    CommonResult queryOrderByUser(String user);
}
