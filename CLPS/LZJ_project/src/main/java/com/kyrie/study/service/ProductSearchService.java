package com.kyrie.study.service;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.vo.param.SearchParam;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 10:10
 */
public interface ProductSearchService {
    /**
     * 根据搜索条件查询产品信息
     * @param searchParam
     * @return
     */
    CommonResult searchProductByCondition(SearchParam searchParam);
}
