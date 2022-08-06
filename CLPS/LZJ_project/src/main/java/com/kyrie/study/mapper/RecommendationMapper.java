package com.kyrie.study.mapper;

import com.kyrie.study.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/28 21:06
 */
public interface RecommendationMapper {
    /**
     * 根据城市查询推荐商品信息
     * @param city
     * @return
     */
    List<Product> selectRecommendationByCity(@Param("city") String city ,@Param("limitNum") int limitNum);

    /**
     * 查询其他城市的推荐商品信息
     * @param city
     * @param limitNum
     * @return
     */
    List<Product> selectRecommendationByOtherCity(@Param("city") String city ,@Param("limitNum") int limitNum);
}
