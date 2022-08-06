package com.ls.study;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ls.study.domain.User;
import com.ls.study.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/5 11:49
 */
@SpringBootTest
@DisplayName("测试mybatis-plus的相关方法")
public class MyTest {
    @Autowired
    UserMapper mapper;

    @DisplayName("测试查询所有数据的方法")
    @Test
    public void test() {
        List<User> userList = mapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @DisplayName("测试插入数据-插入实体中不为空的字段")
    @Test
    public void testInsert() {
        User user = new User();
        user.setAge(18);
        user.setSalary(20.8);
        int insert = mapper.insert(user);
        System.out.println("插入的数据的主键值:" + user.getId());
        Assertions.assertEquals(1, insert);
    }

    @DisplayName("通用的更新操作--默认更新非空字段")
    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(8);
        user.setName("修改名字");
        user.setEmail("xiugai@qq.com");
        int result = mapper.updateById(user);
        Assertions.assertEquals(1, result);
    }

    @DisplayName("通用的查询操作--通过id查询数据")
    @Test
    public void testSelect() {
        /*单条件查询数据*/
        User user = mapper.selectById(8);
        System.out.println(user);
    }

    @DisplayName("通用的查询操作--通过wrapper封装实体查询数据信息")
    @Test
    public void testSelectActive() {
        /*通过多个列记性查询， id + name进行查询*/
        User user = new User();
        user.setId(9);
        user.setName("Lucy");
        Wrapper wrapper = new QueryWrapper(user);
        User result = mapper.selectOne(wrapper);
        System.out.println(result);
    }
    @DisplayName("通用的查询操作--通过多个id进行查询")
    @Test
    public void testBatchSelect(){
        List<User> userList = mapper.selectBatchIds(Arrays.asList(7, 8, 9));
        userList.forEach((user)->{
            System.out.println(user);
        });
    }

    @DisplayName("通用的查询操作--通过Map进行查询")
    @Test
    public void testSelectByMap(){
        //查询条件为name为Lucy且年龄为18岁的用户信息
        Map<String,Object> map=new HashMap<>();
        //map中的key应该写数据库中的列名，按照map中的key去查询数据信息
        map.put("name","Lucy");
        map.put("age",18);
        List<User> userList = mapper.selectByMap(map);
        userList.forEach(user-> System.out.println(user));
    }

    @DisplayName("通用的查询操作--分页进行数据查询")
    @Test
    public void testByPage(){
        //分页查询
        Page page=new Page(2,5);
        Page selectMapsPage = mapper.selectPage(page, null);
        long total = selectMapsPage.getTotal();
        System.out.println("一共有:"+total);

    }

}