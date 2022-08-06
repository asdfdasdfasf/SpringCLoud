package com.kyrie.study.controller;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.service.LoginService;
import com.kyrie.study.vo.param.LoginParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 15:08
 */
@RestController
@Api(tags="登录控制器")
public class LoginController {

    @Resource
    private LoginService loginService;

    @ApiOperation("登录请求")
    @PostMapping("/login")
    public CommonResult commonResult(LoginParam loginParam){
        CommonResult login = loginService.login(loginParam);
        return login;
    }
}
