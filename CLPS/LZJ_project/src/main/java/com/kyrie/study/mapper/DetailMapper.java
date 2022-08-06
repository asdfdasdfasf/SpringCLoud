package com.kyrie.study.mapper;

import com.kyrie.study.pojo.Image;
import com.kyrie.study.pojo.Info;
import com.kyrie.study.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 15:04
 */
public interface DetailMapper {
    /**
     * 根据id查询物品的详细信息
     * @param id
     * @return
     */
    Product selectDetailsById(@Param("id") int id);

    /**
     * 通过货物id查询货物的详细信息
     * @param productId
     * @return
     */
    Info queryInfoById(@Param("id") int productId);

    /**
     * 通过id查询图片信息
     * @param productId
     * @return
     */
    List<Image> queryImagsById(@Param("id") int productId);
}
