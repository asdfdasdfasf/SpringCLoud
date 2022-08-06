package com.baomidou.system.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.system.entity.User;
import com.baomidou.system.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author kyrie
 * @since 2022-01-07
 */
@Controller
@RequestMapping("/system/user")
@Slf4j
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/page")
    @ResponseBody
    public List<User> getPageInfo() {
        Page<User> page=new Page<>(1,2);
        Page<User> userPage = userService.getBaseMapper().selectPage(page, null);
        log.info("分页的总条数:{}",page.getTotal());
        log.info("当前页码:{}",page.getCurrent());
        log.info("总页码:{}",page.getPages());
        log.info("每页显示的条数:{}",page.getSize());
        log.info("是否还有下一页:{}",page.hasNext());
        log.info("是否有上一页:{}",page.hasPrevious());
        return userPage.getRecords();
    }
}

