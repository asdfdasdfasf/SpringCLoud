package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/19 17:38
 */
@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "spring boot index page";
    }

    @RequestMapping("/user")
    @ResponseBody
    public List<User> userList(){
        return userService.getAllUsersInfo();
    }


}
