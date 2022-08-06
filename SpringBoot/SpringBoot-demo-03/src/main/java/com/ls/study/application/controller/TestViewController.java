package com.ls.study.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/28 15:07
 */
@Controller
public class TestViewController {
    @GetMapping("/succ")
    public String gotosuccess(Model model){
        System.out.println("请求进来了");
        model.addAttribute("msg","你好世界");
        model.addAttribute("address","www.bilibili.com");
        return "success";
    }

}
