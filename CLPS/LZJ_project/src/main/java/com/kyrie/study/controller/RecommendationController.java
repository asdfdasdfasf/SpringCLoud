package com.kyrie.study.controller;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.service.RecommendationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 20:58
 */
@Controller
@Api(tags="热门推荐控制器")
public class RecommendationController {

    @Resource
    private RecommendationService recommendationService;

    /**
     * 根据城市查询热门推荐物品信息
     * @param city
     * @return
     */
    @GetMapping("/recommendation")
    @ResponseBody
    @ApiOperation("热门推荐")
    @ApiImplicitParam(name="city",value = "城市")
    public CommonResult getRecommendationList(@RequestParam("city") String city){
        return recommendationService.getRecommendationList(city);
    }
}
