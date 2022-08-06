package com.example.springbootdemoadmin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringBootDemoAdminApplicationTests {
    @Autowired
    JdbcTemplate template;

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
        List<Map<String, Object>> maps = template.queryForList("select *from dept");
        System.out.println(maps);
        System.out.println(dataSource);
    }
    
    @Test
    public void test(){

    }
}
