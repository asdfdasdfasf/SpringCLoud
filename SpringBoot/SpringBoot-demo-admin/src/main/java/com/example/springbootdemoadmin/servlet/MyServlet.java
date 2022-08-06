package com.example.springbootdemoadmin.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/30 17:48
 */

/**
 * 如何在SpringBoot项目中使用Servlet
 *  1. 创建一个servlet，使用@WebServlet注解标注请求路径
 *  2. 在springboot的启动类上标注@ServletComponentScan(basePackages = "指定扫描的包路径")
 *  3. 直接访问请求路径，该路径不会被拦截器拦截
 */
//@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello world");
    }
}
