package com.ls.study.mapper;

import com.ls.study.model.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}