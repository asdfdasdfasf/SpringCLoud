package com.atguigu.crowd.service.api;

import com.atguigu.crowd.entity.Admin;
import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/12 20:22
 */
public interface AdminService {
    public void save(Admin admin);

    List<Admin> selectAll();
}
