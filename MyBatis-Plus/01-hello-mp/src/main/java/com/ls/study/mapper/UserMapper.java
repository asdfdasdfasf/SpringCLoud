package com.ls.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ls.study.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/5 11:44
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
