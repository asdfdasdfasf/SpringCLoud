package com.kyrie.study.controller;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.service.DetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 14:52
 */
@Controller
@Api(tags="商品详细信息控制器")
public class DetailsController {

    @Resource
    private DetailService detailService;

    /**
     * 根据id查询详细信息
     * @param id
     * @return
     */
    @GetMapping("/details")
    @ResponseBody
    @ApiOperation("获取商品详细信息")
    @ApiImplicitParam(name="id",value="商品id",required = true)
    public Object getDetails(int id){
        return detailService.queryDetailsById(id).getData();
    }
}
