package com.example.study.generator.system.service.impl;

import com.example.study.generator.system.entity.User;
import com.example.study.generator.system.mapper.UserMapper;
import com.example.study.generator.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kyrie
 * @since 2022-01-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
