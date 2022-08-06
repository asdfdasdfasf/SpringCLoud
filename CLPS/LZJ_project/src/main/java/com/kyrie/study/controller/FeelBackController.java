package com.kyrie.study.controller;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.service.FeelBackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/31 16:03
 */
@RestController
@Api(tags="用户评价控制器")
public class FeelBackController {

    @Resource
    private FeelBackService feelBackService;

    @ApiImplicitParams({
            @ApiImplicitParam(name="orderId",value="商品id"),
            @ApiImplicitParam(name="feelback",value="评论信息")
    })
    @ApiOperation("用户反馈评论")
    @PostMapping("/feelback")
    public CommonResult feelBack(@RequestParam("orderId") int orderId, @RequestParam("feelback") String feelBack){
        return feelBackService.feelBack(orderId,feelBack);
    }

}
