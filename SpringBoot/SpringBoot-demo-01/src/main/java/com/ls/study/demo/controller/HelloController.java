package com.ls.study.demo.controller;

import com.ls.study.demo.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/23 16:45
 */
@Controller
public class HelloController {
    @Value("${server.port}")
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String path;

    @Autowired
    private Goods goods;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(goods.toString());
        for (Object item : goods.getItems()) {
            System.out.println(item);
        }

        return "欢迎使用SpringBoot!"+path+":"+port;
    }

    @RequestMapping("/test")
    public ModelAndView test(){
        System.out.println("hello world");
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","hello springboot");
        mv.setViewName("hello");
        return mv;
    }

}
