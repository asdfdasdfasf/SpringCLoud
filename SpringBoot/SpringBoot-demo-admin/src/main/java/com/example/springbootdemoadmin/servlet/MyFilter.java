package com.example.springbootdemoadmin.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/30 17:55
 */
//设置拦截的路径
//@WebFilter(urlPatterns = {"/css/*"})
@Slf4j
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("过滤器方法初始化!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("myFilter               do work");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        log.info("过滤器销毁!");
    }
}
