package com.kyrie.study.mapper;

import com.kyrie.study.pojo.ProductUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/31 19:24
 */
public interface FeelBackMapper {

    @Select("select  username from lzj_product_user where product_id=#{orderId}")
    ProductUser findUserNameById(@Param("orderId") int orderId);
}
