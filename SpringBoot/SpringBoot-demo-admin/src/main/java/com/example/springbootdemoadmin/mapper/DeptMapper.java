package com.example.springbootdemoadmin.mapper;

import com.example.springbootdemoadmin.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/3 21:31
 */
@Mapper
public interface  DeptMapper {
    Dept findDept( @Param("id") Integer id);
}
