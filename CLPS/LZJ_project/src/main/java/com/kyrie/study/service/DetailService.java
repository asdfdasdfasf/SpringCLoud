package com.kyrie.study.service;

import com.kyrie.study.common.CommonResult;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 15:01
 */
public interface DetailService {
    /**
     * 根据id查询物品的详细信息
     * @param id
     * @return
     */
    CommonResult queryDetailsById(int id);
}
