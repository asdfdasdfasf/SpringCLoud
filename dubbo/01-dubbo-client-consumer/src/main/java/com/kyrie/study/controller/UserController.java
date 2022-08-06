package com.kyrie.study.controller;

import com.kyrie.study.domain.User;
import com.kyrie.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/10 17:03
 */
@Controller
public class UserController {
    @Autowired
    public UserService userService;

    @ResponseBody
    @GetMapping("/dubbo")
    public Map<String,? extends Object> getResult(){
        List<User> userList = userService.queryAllUsers();
        return Collections.singletonMap("result",userList);
    }
}
