package com.ls.study.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/27 10:38
 */
@RestController
public class WebController {
    @GetMapping("/user/{id}/{name}")
    public Map<String,Object> getInfo(@PathVariable("id") Integer UserId,@PathVariable("name") String username){
        Map<String,Object> map=new HashMap<>();
        map.put("id",UserId);
        map.put("name",username);
        return map;
    }
    @GetMapping("/userList")
    public Map<String,Object> getInfoList(@PathParam("uuid") Integer id,@PathParam("username") String username){
        Map<String,Object> map=new HashMap<>();
        map.put("userId",id);
        map.put("userName",username);
        return map;
    }
}
