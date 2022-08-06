package com.ls.study.application.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/25 13:50
 */
@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello SpringBoot";
    }

    @GetMapping("/user")
    public String getInfo(String username){
        return "get method!"+username;
    }
    @PostMapping("/user")
    public String postInfo(String username){
        return "Post method!"+username;
    }
    @PutMapping("/user")
    public String putInfo(String username){
        return "put method!"+username;
    }
    @DeleteMapping("/user")
    public String deleteInfo(String username){
        return "delete method!"+username;
    }
}
