package com.kyrie.study.controller;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.service.HotProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 14:21
 */
@Controller
@Api(tags="热门商品控制器")
public class HotProductController {


    @Resource
    private HotProductService hotProductService;

    /**
     * 查询热门商品信息
     * @return
     */
    @GetMapping("/hotProduct")
    @ApiOperation("热门商品查询")
    @ResponseBody
    @ApiImplicitParam(name="city",value="城市")
    public CommonResult getHotProductList(@RequestParam("city") String city){
        CommonResult commonResult = hotProductService.queryHotProductList(city);
        return commonResult;
    }
}
