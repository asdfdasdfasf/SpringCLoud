package com.atguigu.crowd.mvc.controller;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.service.api.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/12 23:46
 */
@Controller
public class TestController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/test/ssm.html")
    public String test(Model model){
        List<Admin> list= adminService.selectAll();
        model.addAttribute("dataList",list);
        return "target";
    }
}
