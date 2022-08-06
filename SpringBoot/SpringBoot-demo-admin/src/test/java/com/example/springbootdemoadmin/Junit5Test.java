package com.example.springbootdemoadmin;

import org.apiguardian.api.API;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/4 15:35
 */
@DisplayName("测试displayName注解")
public class Junit5Test {
    @DisplayName("测试displayName注解")
    @Test
    public void test(){
        System.out.println("111");
    }

    @BeforeEach
    @Test
    public void beforeEach(){
        System.out.println("测试之前执行");
    }

    /**
     * 前面的断言失败了，后面的代码就不会执行了
     */
    @DisplayName("测试简单断言")
    @Test
    public void testAssert(){
        int result = cal(6, 5);
        Assertions.assertEquals(8,result,"计算结果不符合预期效果");

    }
    public int cal(int a,int b){
        return a+b;
    }
}
