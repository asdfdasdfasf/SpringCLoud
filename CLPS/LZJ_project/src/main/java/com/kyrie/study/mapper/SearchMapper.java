package com.kyrie.study.mapper;
import java.util.List;
import com.kyrie.study.pojo.Product;
import org.apache.ibatis.annotations.Param;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/29 12:12
 */
public interface SearchMapper {
    /**
     * 根据条件查询商品的信息
     * @param city 城市
     * @param content 搜索条件
     * @param page 页数
     * @return
     */
    List<Product> searchProductByCondition(
            @Param("city") String city
            ,@Param("content") String content,
            @Param("page") int page
    );
}
