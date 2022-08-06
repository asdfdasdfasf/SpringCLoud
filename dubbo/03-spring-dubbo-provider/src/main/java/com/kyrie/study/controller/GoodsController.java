package com.kyrie.study.controller;

import com.kyrie.study.domain.Goods;
import com.kyrie.study.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/13 11:38
 */
@RestController
public class GoodsController {
    @Autowired
    GoodsService service;

    @GetMapping("/goods")
    public List<Goods> getGoodsList(){
        return service.queryAllGoods();
    }
}
