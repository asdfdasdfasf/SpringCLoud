package com.baomidou.system.mapper;

import com.baomidou.system.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author kyrie
 * @since 2022-01-07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
