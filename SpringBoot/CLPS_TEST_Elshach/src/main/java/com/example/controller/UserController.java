package com.example.controller;

import com.example.pojo.User;
import com.example.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/23 11:49
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户测试类")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value="根据用户名查询用户",notes = "使用该方法记得给好评哦!")
    @ApiImplicitParam(name="userName",value="用户的姓名",required = true,paramType ="path",dataType = "String")
    @GetMapping("/queryUserByUserName/{userName}")
    public User queryUserByUserName(@PathVariable String userName){
        return userService.queryUserByUserName(userName);
    }

    /**
     * 根据用户ID查询用户对象
     * @param userId
     * @return
     */
    @GetMapping("/queryUserById/{userId}")
    public User queryUserById(@PathVariable Integer userId){
        return userService.queryUserById(userId);
    }
}
