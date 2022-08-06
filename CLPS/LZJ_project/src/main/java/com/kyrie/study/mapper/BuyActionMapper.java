package com.kyrie.study.mapper;

import com.kyrie.study.pojo.ProductUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 15:57
 */
public interface BuyActionMapper {
    /**
     * 查询是否已经有相关的预定信息
     * @param id
     * @return
     */
    @Select("select count(*) from lzj_product_user where product_id=#{id}")
    int queryProductById(@Param("id") String id);

    /**
     * 插入相关的保存信息
     * @param productId
     * @param user
     */
    @Insert("insert into lzj_product_user(username,product_id) values(#{username},#{productId})")
    void saveProductInfo( @Param("productId") String productId, @Param("username") String user);

    @Select("select *from lzj_product_user where username=#{user} and product_id=#{id}")
    ProductUser queryByName(@Param("id") String id, @Param("user") String user);
}
