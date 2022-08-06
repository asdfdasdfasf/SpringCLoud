package com.kyrie.study.service.imp;

import com.kyrie.study.common.CommonResult;
import com.kyrie.study.service.VerifyService;
import com.kyrie.study.util.VerifyUtils;
import net.sf.jsqlparser.statement.select.KSQLJoinWindow;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 23:37
 */
@Service
public class VerifyServiceImpl implements VerifyService {

    @Resource
    private RedisTemplate redisTemplate;
    /**
     * 验证码验证
     * @param phone
     * @return
     */
    @Override
    public CommonResult verifyCode(String phone) {
        //验证手机号是否合法
        if(!isPhone(phone)){
            return CommonResult.fail(500,"手机不合法");
        }
        //先从redis中获取是否存在验证码
        Object code = redisTemplate.opsForValue().get(phone);
        if(code==null){
            //模拟生成四位的验证码
            Random random=new Random();
            StringBuffer buffer=new StringBuffer();
            for(int i=0;i<4;i++){
                buffer.append(random.nextInt(10));
            }
            //设置两分钟过期时间
            redisTemplate.opsForValue().set(phone,buffer.toString(),60, TimeUnit.SECONDS);
            System.out.println(buffer.toString());
            //发送短信，获取验证码
            boolean is_success=VerifyUtils.sendVerifyCode(phone,buffer.toString());
            if(is_success){
                return CommonResult.success("验证码生成好了，可以登录");
            }
            return CommonResult.fail(500,"获取验证码失败");
        }else{
            return CommonResult.fail(500,"验证码还在生效时间内");
        }
    }

    /**
     * 验证手机号是否合法
     * @param phone
     * @return
     */
    public static boolean isPhone(String phone) {
        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        if (phone.length() != 11) {
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            return m.matches();
        }
    }
}
