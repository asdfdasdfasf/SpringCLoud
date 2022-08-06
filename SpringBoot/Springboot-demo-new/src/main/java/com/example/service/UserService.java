package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/21 9:44
 */
@Service
public class UserService{
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsersInfo(){
        return userMapper.findUsersInfo();
    }


}
