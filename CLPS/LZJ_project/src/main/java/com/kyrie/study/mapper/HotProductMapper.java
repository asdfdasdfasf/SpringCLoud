package com.kyrie.study.mapper;

import com.kyrie.study.pojo.Product;
import org.apache.ibatis.annotations.Param;
import java.util.List;
/**
 * @author kyrieStudy
 */
public interface HotProductMapper {

    /**
     * 根据城市查询热销产品
     * @param city
     * @return
     */
    List<Product> selectProductByCity(@Param("city") String city,@Param("limitNum") int limitNum);

    /**
     * 查询其他城市的热销产品
     * @param city
     * @param limitNum
     * @return
     */
    List<Product> selectProductByOtherCity(@Param("city")String city, @Param("limitNum") int limitNum);
}
