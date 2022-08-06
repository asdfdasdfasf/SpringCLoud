package com.kyrie.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/14 10:47
 */
@RestController
public class RedisController {
    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/redis")
    public String testRedis(){
        redisTemplate.opsForValue().set("redis","kyrieIrving");
        return (String) redisTemplate.opsForValue().get("redis");
    }

}
