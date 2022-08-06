package com.kyrie.study.jedis;

import redis.clients.jedis.Jedis;

import java.util.Random;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/14 10:00
 */
public class PhoneCodeCheck {
    public static void main(String[] args) {
//        verifyCode("13890268546");
       verifySuccessCode("13890268546","678829");
    }

    //1. 生成六位随机的验证码
    public static String getCode() {
        Random random = new Random();
        StringBuffer buffer=new StringBuffer();
        for (int i = 0; i < 6; i++) {
            int value=random.nextInt(10);
            buffer.append(value);
        }
        return buffer.toString();
    }
    //2.将验证码放到redis中并且设置过期时间，每个手机每天只能发送三次，
    public static void verifyCode(String phone){
        //1. 连接redis
        Jedis jedis=new Jedis("192.168.88.139",6379);
        //2. 拼接key  手机发送次数的key
        String countKey="VerifyCode"+phone+":count";
        String codeKey="VerifyCode"+phone+":code";
        //判断是否存在发送次数
        String count = jedis.get(countKey);
        if(count==null){
            jedis.setex(countKey,24*60*60,"1");
        }else if(Integer.parseInt(count)<=2){
            jedis.incr(countKey);
        }else if(Integer.parseInt(count)>2){
            System.out.println("今天的发送次数超过了三次");
            jedis.close();
        }
        //3. 将验证码添加到redis中，并且设置2分钟过期
        jedis.setex(codeKey,60*2,getCode());
        jedis.close();
    }
    //3. 验证校验是否成功
    public static void verifySuccessCode(String phone,String code){
        Jedis jedis=new Jedis("192.168.88.139",6379);
        String codeKey="VerifyCode"+phone+":code";
        String redisValue = jedis.get(codeKey);
        if(redisValue.equals(code)){
            System.out.println("校验成功，成功登陆");
        }else{
            System.out.println("登陆失败");
        }
    }
}
