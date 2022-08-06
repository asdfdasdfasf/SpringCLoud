package com.kyrie.study.mapper;

import com.kyrie.study.domain.Goods;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/13 11:21
 */
public interface GoodsMapper {
    List<Goods> selectAllGoods();
}
