package com.baomidou.system.service.impl;

import com.baomidou.system.entity.User;
import com.baomidou.system.mapper.UserMapper;
import com.baomidou.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kyrie
 * @since 2022-01-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
