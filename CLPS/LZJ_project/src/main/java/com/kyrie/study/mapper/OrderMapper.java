package com.kyrie.study.mapper;

import com.kyrie.study.pojo.Product;
import com.kyrie.study.pojo.ProductUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;

import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 20:18
 */
public interface OrderMapper {

    List<ProductUser> selectOrderByName(@Param("username") String user);


    Product selectByProductId(@Param("productId") int productId);
}
