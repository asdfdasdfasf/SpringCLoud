package com.example.service;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/23 11:27
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User queryUserByUserName(String userName){
        return userMapper.queryUserByUserName(userName);
    }

    /**
     * 通过用户ID查询用户
     * @param id
     * @return
     */
    public User queryUserById(Integer id){
        return userMapper.queryUserById(id);
    }


}
