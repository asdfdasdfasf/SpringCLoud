package com.kyrie.ls.service.imp;

import com.kyrie.study.domain.User;
import com.kyrie.study.service.UserService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/10 16:11
 */
public class UserServiceImp implements UserService {
    @Override
    public List<User> queryAllUsers() {
        Map<String,Object> map=new HashMap<>();
        map.put("basketball","欧文");
        map.put("pingpong","马龙");
        User user1=new User("路飞",18,"lufei@qq.com",map);
        User user2=new User("杜兰特",36,"lufei@qq.com",map);
        User user3=new User("詹姆斯",18,"lufei@qq.com",map);
        User user4=new User("金木研",21,"lufei@qq.com",map);
        return Arrays.asList(user1,user2,user3,user4);
    }
}
