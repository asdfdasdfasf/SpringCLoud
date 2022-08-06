package com.atguigu.crowd.service.impl;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.entity.AdminExample;
import com.atguigu.crowd.mapper.AdminMapper;
import com.atguigu.crowd.service.api.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/12 20:22
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public void save(Admin admin) {
        adminMapper.insert(admin);
    }

    /**
     * 用于测试SSM整合环境
     * @return
     */
    @Override
    public List<Admin> selectAll() {
        List admins = adminMapper.selectByExample(new AdminExample());
        return admins;
    }
}
