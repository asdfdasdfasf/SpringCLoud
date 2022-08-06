package com.kyrie.study.mapper;

import com.kyrie.study.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 13:13
 */
public interface BuyTimeMapper {

    @Select("select count(*) from lzj_product where id=#{id}")
    int isExist(@Param("id") int id);
}
