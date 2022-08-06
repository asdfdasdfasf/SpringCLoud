package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/23 11:24
 */
@Mapper
public interface UserMapper {
    // 根据用户名查询用户记录
    User queryUserByUserName(String userName);

    // 通过用户ID查询用户
    public User queryUserById(Integer id);

    // 添加用户
    public int save(User user);
}
