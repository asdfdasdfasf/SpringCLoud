package com.example.hello;

import com.example.hello.domain.User;
import com.example.hello.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@DisplayName("测试AR相关的功能")
class HelloApplicationTests {

    @Autowired
    private UserMapper mapper;
    @Test
    void contextLoads() {
        System.out.println("获取的mapper:"+mapper);
    }
    @DisplayName("AR插入操作")
    @Test
    public void test1(){
        User user=new User();
        user.setName("宋红康老师");
        user.setAge(19);
        user.setEmail("songhk@qq.com");
        boolean insert = user.insert();
        Assertions.assertEquals(true,insert);
    }

    @DisplayName("AR获取所有的数据")
    @Test
    public void testSelect(){
        User user=new User();
        List<User> userList = user.selectAll();
        userList.forEach(System.out::println);
    }

}
