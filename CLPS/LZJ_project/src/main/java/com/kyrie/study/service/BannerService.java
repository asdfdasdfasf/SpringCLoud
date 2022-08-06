package com.kyrie.study.service;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.pojo.Banner;
import java.util.List;
/**
 * @author kyrieStudy
 */
public interface BannerService {
    /**
     * 查询轮播图信息
     * @return
     */
    CommonResult queryBannerList();
}
