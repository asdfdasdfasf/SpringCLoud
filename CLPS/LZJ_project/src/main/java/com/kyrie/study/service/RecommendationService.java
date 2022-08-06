package com.kyrie.study.service;

import com.kyrie.study.common.CommonResult;
import org.apache.ibatis.annotations.Param;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 21:01
 */
public interface RecommendationService {
    /**
     * 根据城市查询热门推荐物品信息
     * @param city
     * @return
     */
    public CommonResult getRecommendationList(String city);
}
