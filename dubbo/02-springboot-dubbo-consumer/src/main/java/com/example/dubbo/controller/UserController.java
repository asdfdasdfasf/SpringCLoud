package com.example.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kyrie.study.domain.User;
import com.kyrie.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/12 9:34
 */
@Controller
public class UserController {

    @Reference(interfaceClass = UserService.class)
    UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public List<User> userList(){
        return userService.queryAllUsers();
    }
}
