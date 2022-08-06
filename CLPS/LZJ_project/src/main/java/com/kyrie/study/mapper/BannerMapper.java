package com.kyrie.study.mapper;

import com.kyrie.study.pojo.Banner;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 12:16
 */
public interface BannerMapper {

    /**
     * 查询录播图信息
     * @return
     */
    List<Banner> selectBannerList();
}
