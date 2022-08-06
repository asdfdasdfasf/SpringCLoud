package com.kyrie.study.mapper;

import com.kyrie.study.pojo.User;
import com.kyrie.study.vo.param.LoginParam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/30 15:17
 */
public interface LoginMapper {
    /**
     * 判断用户是否存在
     * @param username
     * @return
     */
    @Select("select id,username from lzj_user where username=#{username}")
    User checkUserInfo(@Param("username") String username);

    /**
     * 向表中添加数据
     * @param loginParam
     */
    @Insert("insert into lzj_user(username) values(#{username})")
    void addUser(LoginParam loginParam);
}
