package com.kyrie.study.service;

import com.kyrie.study.domain.Goods;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/13 11:11
 */
public interface GoodsService{
    List<Goods> queryAllGoods();
}
