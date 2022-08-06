package com.kyrie.study.imp;

import com.kyrie.study.domain.Goods;
import com.kyrie.study.mapper.GoodsMapper;
import com.kyrie.study.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/13 11:13
 */
@Service
public class GoodsServiceImp implements GoodsService {
    @Autowired
    GoodsMapper mapper;
    @Override
    public List<Goods> queryAllGoods() {
        return mapper.selectAllGoods();
    }
}
