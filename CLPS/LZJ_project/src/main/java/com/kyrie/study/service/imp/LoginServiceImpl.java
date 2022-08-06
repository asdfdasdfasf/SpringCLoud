package com.kyrie.study.service.imp;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.mapper.LoginMapper;
import com.kyrie.study.pojo.User;
import com.kyrie.study.service.LoginService;
import com.kyrie.study.vo.param.LoginParam;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 15:15
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public CommonResult login(LoginParam loginParam) {
        //获取用户名
        String username = loginParam.getUsername();
        //获取密码
        String password = loginParam.getPassword();
        //检查是否登录成功
        String code = (String) redisTemplate.opsForValue().get(username);
        if(code==null){
            return CommonResult.fail(500,"获取验证码失败");
        }
        //判断用户是否存在，如果不存在插入到数据库中
        User user=loginMapper.checkUserInfo(username);
        if(user==null){
            loginMapper.addUser(loginParam);
        }
        if(code.equals(password)){
            return CommonResult.success("登录成功");
        }else{
            return CommonResult.fail(500,"登录失败");
        }

    }
}
