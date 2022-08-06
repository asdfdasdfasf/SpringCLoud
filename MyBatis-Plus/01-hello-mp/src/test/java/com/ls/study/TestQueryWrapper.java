package com.ls.study;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ls.study.domain.Dept;
import com.ls.study.domain.User;
import com.ls.study.mapper.DeptMapper;
import com.ls.study.mapper.UserMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/5 17:31
 */
@SpringBootTest
@SuppressWarnings("all")
public class TestQueryWrapper {
    @Autowired
    UserMapper userMapper;

    @Autowired
    DeptMapper deptMapper;

    @DisplayName("条件构造器--queryWrapper构造条件查询")
    @Test
    public void testQueryWrapper(){
        //分页查询年龄18--25岁的姓名为kyrie的所有用户
        //1.封装查询条件,column必须写的是数据库中的列名
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.between("age",18,25);
        wrapper.eq("name","kyrie");
        //2.分页查询指定条件数据
        Page page = userMapper.selectMapsPage(new Page<>(2, 1), wrapper);
        //3.获取查询到的数据列表
        page.getRecords().forEach((user)-> System.out.println(user));
    }


    @DisplayName("测试使用maper映射文件的方式查询数据")
    @Test
    public void getDept(){
        Dept dept = deptMapper.getDept(1);
        System.out.println(dept);
    }

    @DisplayName("条件构造器--queryWrapper构造模糊查询")
    @Test
    public void testLike(){
        //查询姓名中有'L'的，或者是年龄大于25岁的用户信息
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.like("name",'L');
                //.or() //SQL:SELECT id,name,email,age FROM user WHERE (name LIKE ? OR age > ?)
                //.or((condition)->condition.gt("age",25)); //SQL: SELECT id,name,email,age FROM user WHERE (name LIKE ? OR (age > ?)) 嵌套查询
        List<User> users = userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
