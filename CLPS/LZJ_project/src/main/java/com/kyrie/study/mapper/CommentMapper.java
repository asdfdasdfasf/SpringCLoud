package com.kyrie.study.mapper;

import com.kyrie.study.pojo.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 19:25
 */
public interface CommentMapper {

    @Select("select id,username,comment,start from lzj_comment where product_id=#{id} limit #{number},6")
    List<Comment> selectComment(@Param("id") int id, @Param("number") int number);

    @Insert("insert into lzj_comment(username,comment,product_id) values(#{username},#{comment},#{productId})")
    int addComment(@Param("username") String username, @Param("comment") String feelBack, @Param("productId") int orderId);

    @Update("update lzj_product_user set comment_state=2 where product_id=#{orderId}")
    int updateComment(@Param("orderId") int orderId);
}
