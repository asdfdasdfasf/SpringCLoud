package com.example.springbootdemoadmin.service;

import com.example.springbootdemoadmin.mapper.DeptMapper;
import com.example.springbootdemoadmin.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/3 21:34
 */
@Service
public class DeptService {
    @Autowired
    private DeptMapper mapper;
    public Dept findDeptById(Integer id){
        System.out.println("mapper-->"+mapper.findDept(id));
        return mapper.findDept(id);
    }
}
