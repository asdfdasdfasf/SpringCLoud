package com.kyrie.study.service;

import com.kyrie.study.common.CommonResult;

/**
 * @author kyrieStudy
 */
public interface HotProductService {
    /**
     * 根据城市查询最热商品的信息
     * @param city
     * @return
     */
    public CommonResult queryHotProductList(String city);
}
