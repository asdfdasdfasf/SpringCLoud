package com.example.springbootdemoadmin.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/2 9:39
 */
@Slf4j
//@WebListener
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("监听器-->项目初始化完成");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("监听器-->项目销毁");
    }
}
