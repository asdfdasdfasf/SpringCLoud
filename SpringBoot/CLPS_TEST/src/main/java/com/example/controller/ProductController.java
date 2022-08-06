package com.example.controller;

import com.example.common.CommonResult;
import com.example.entity.Product;
import com.example.entity.User;
import com.example.service.ProductService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/22 13:33
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @Autowired
    private UserService userService;

    @RequestMapping("/product")
    @ResponseBody
    public List<Product> productList(){
        return service.getList();
    }

    @PutMapping("/save")
    @ResponseBody
    public CommonResult saveUser(@RequestBody User user){
        int count=userService.insert(user);
        return count==1? CommonResult.success("插入成功",count):CommonResult.fail("插入失败");
    }
}
