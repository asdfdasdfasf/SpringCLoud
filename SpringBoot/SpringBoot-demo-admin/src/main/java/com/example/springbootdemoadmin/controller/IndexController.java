package com.example.springbootdemoadmin.controller;

import com.example.springbootdemoadmin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/28 16:18
 */
@Controller
public class IndexController {
    /**
     * 访问登录页面
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String index(){
        return "login";
    }

    /**
     * 处理登录请求
     */
    @PostMapping("/login")
    public String main(User user, Model model, HttpSession session){
        if(!StringUtils.isEmpty(user.getUserName())&&"252525".equals(user.getPassword())){
            session.setAttribute("userLogin",user);
            //重定向无法跳转到templates下的html，只能中转
            return "redirect:/main.html";
        }
        model.addAttribute("msg","用户名或者密码错误");
        return "/login";
    }
    @GetMapping("/main.html")
    public String goMain(HttpSession session,Model model){
        return "index";
    }
}
