package com.kyrie.ls.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/10 16:21
 */
public class MainTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();
        System.in.read();
    }
}
