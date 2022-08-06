package com.ls.study;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ls.study.domain.User;
import com.ls.study.mapper.UserMapper;
import com.mysql.cj.exceptions.StatementIsClosedException;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/5 11:39
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ls.study.mapper")
public class SpringBootApplicationMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootApplicationMain.class, args);
    }

}
