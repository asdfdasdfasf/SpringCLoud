package com.kyrie.study.controller;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.service.BuyActionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.smartcardio.CommandAPDU;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 15:45
 */
@RestController
@Api(tags = "商品预定控制器")
public class BuyActionController {

    @Resource
    private BuyActionService actionService;

    /**
     * 商品预订信息
     * @param id 货物的id
     * @param user 用户名
     * @return
     */
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="商品id",required =true,paramType="query"),
            @ApiImplicitParam(name="user",value="用户名",required =true,paramType="query")
    })
    @ApiOperation(value="商品预定")
    @GetMapping("/buyaction")
    public CommonResult commonResult(@Param("id") String id, @Param("user") String user){
       return actionService.buyAction(id,user);
    }
}
