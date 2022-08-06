package com.baomidou.system;
import com.example.study.generator.system.entity.User;
import com.example.study.generator.system.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/7 14:18
 */
@SpringBootTest
public class MyTest {
    @Autowired
    private UserMapper mapper;
    @Test
    public void test(){
        User user=new User();
        user.setAge(18);
        int delete = mapper.insert(user);
        System.out.println(delete);
    }
}
