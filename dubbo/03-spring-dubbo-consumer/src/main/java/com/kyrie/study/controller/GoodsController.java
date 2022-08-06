package com.kyrie.study.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kyrie.study.domain.Goods;
import com.kyrie.study.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/13 13:45
 */
@RestController
public class GoodsController {
    @Autowired
    GoodsService service;
    @GetMapping("good")
    public List<Goods> getGoods(){
        List<Goods> goods = service.queryAllGoods();
        return goods;
    }
}
