package com.ls.study.mapper;

import com.ls.study.domain.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/5 22:26
 */
@Mapper
public interface DeptMapper {
   Dept getDept(@Param("id") Integer deptId);
}
