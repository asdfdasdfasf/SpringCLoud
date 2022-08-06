package com.kyrie.study.service.imp;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.common.Const;
import com.kyrie.study.mapper.BannerMapper;
import com.kyrie.study.pojo.Banner;
import com.kyrie.study.service.BannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 12:14
 */
@Service
public class BannerServiceImpl implements BannerService {

    @Resource
    private BannerMapper bannerMapper;

    /**
     * 查询录播图信息
     * @return
     */
    @Override
    public CommonResult<String> queryBannerList() {
        List<Banner> bannerList = bannerMapper.selectBannerList();

        if(bannerList==null||bannerList.isEmpty()){
            return CommonResult.fail(500,"查询数据信息为空");
        }
        List<String> result=new ArrayList<>();
        //拼装路径
        bannerList.forEach(banner->{
            banner.setUrl(Const.BASE_URL+Const.IMAGE_URL+banner.getUrl());
            result.add(banner.getUrl());
        });
        return CommonResult.success(result);
    }
}
