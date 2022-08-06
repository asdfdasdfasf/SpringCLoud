package com.example.springbootdemoadmin.controller;

import com.example.springbootdemoadmin.pojo.Dept;
import com.example.springbootdemoadmin.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/3 21:37
 */
@RestController
public class DeptController {
    @Autowired
   private DeptService service;
    @GetMapping("/dept/{id}")
    public Dept dept(@PathVariable("id") Integer id){
        System.out.println("id="+id);
        System.out.println("请求进来了!");
        return service.findDeptById(id);
    }
}
