package com.kyrie.study.controller;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.service.BuyTimeService;
import com.sun.prism.shader.Mask_TextureSuper_AlphaTest_Loader;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 13:02
 */
@RestController
@Api(tags="倒计时控制器")
public class BuyTimeController {
    @Resource
    private BuyTimeService buyTimeService;

    @ApiImplicitParam(name="id",value = "商品id",required = true,paramType = "query")
    @ApiOperation("获取商品预定倒计时")
    @GetMapping("/buytime")
    public Map<String,String> buyTime(@RequestParam("id") int id){
        CommonResult commonResult = buyTimeService.buyTime(id);
        Map<String,String> result=new HashMap<>();
        result.put("time",commonResult.getData().toString());
        return result;
    }
}
