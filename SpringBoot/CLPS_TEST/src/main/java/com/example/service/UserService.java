package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/23 11:01
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public int insert(User user) {
        return userMapper.saveUser(user);
    }
}
