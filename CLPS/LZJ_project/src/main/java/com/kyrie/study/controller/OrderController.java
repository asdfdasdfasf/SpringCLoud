package com.kyrie.study.controller;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 20:06
 */
@RestController
@Api(tags="订单控制器")
public class OrderController {

    @Resource
    private OrderService orderService;

    @ApiOperation("查询购物车订单信息")
    @GetMapping("/order")
    @ApiImplicitParam(name="user",value="用户名")
    public Object orderList(@RequestParam("user") String user){
         return orderService.queryOrderByUser(user).getData();
    }
}
