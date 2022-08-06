package com.kyrie.study.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/14 9:34
 */
public class JedisDemo1 {
    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis=new Jedis("192.168.88.139",6379);

        //测试
        String ping = jedis.ping();
        System.out.println(ping);
        jedis.close();
    }
    //操作String 类型的数据
    @Test
    public void test(){
        Jedis jedis=new Jedis("192.168.88.139",6379);
        //添加String类型
        jedis.set("jedis","美好的生活");
        //获取String类型的值
        String result = jedis.get("jedis");
        System.out.println(result);

        //设置多个key和value
        jedis.mset("k1","v1","k2","v2");
        for (String s : jedis.mget("k1", "k2")) {
            System.out.println(s);
        }
        jedis.close();
    }
    @Test //操作list
    public void testList(){
        Jedis jedis=new Jedis("192.168.88.139",6379);
        jedis.lpush("list","1","2","3");
        List<String> list = jedis.lrange("list", 0, -1);
        list.forEach(System.out::println);
        jedis.close();
    }
}
