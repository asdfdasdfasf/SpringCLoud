package com.example.hello.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hello.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/5 11:44
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
