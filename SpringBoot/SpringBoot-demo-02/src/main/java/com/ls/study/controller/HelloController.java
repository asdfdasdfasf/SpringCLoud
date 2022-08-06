package com.ls.study.controller;

import com.ls.study.domain.User;
import com.ls.study.mapper.DeptMapper;
import com.ls.study.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/24 20:53
 */
@Controller
public class HelloController {

    @Autowired
    private Date date;

    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private User user;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(user);
        System.out.println(date);
        return "hello world";
    }

    @RequestMapping("/get")
    @ResponseBody
    public Dept deptList(){
        return deptMapper.selectByPrimaryKey(1);
    }
}
