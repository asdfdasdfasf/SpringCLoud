package com.kyrie.study.controller;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.mapper.BannerMapper;
import com.kyrie.study.pojo.Banner;
import com.kyrie.study.service.BannerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 11:55
 */
@Api(tags = "轮播图控制器")
@Controller
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @ApiOperation(value="获取首页轮播图信息")
    @GetMapping("/banner")
    @ResponseBody
    public CommonResult selectBannerList(){
        return bannerService.queryBannerList();
    }
}
