package com.example.springbootdemoadmin.controller;

import com.example.springbootdemoadmin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/28 20:43
 */
@Controller
public class TableController {
    @GetMapping("/basic_table")
    public String basic(){
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic(Model model){
        List<User> userList = Arrays.asList(new User("lucy", "1234134"),
                new User("kyrie", "1564564"),
                new User("Hame", "48855"),
                new User("asdjf", "12345")
        );
        model.addAttribute("userList",userList);
        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive(){
        return "table/responsive_table";
    }


}
