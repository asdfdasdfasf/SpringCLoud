package com.kyrie.study.controller;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.service.VerifyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 20:32
 */
@Controller
@Api(tags="验证码控制器")
public class VerifyCodeController {

    @Resource
    private VerifyService verifyService;

    @ApiOperation("发送验证码")
    @PostMapping("/sendyzm")
    @ResponseBody
    @ApiImplicitParam(name="phone",value="手机号")
    public CommonResult sendVerifyCode(@RequestParam("phone") String phone){
        return verifyService.verifyCode(phone);
    }
}
