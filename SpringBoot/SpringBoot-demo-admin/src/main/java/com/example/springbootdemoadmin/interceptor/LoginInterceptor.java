package com.example.springbootdemoadmin.interceptor;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2021/12/30 11:09
 */

import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录检查
 * 1、配置好拦截器要拦截哪些请求
 * 2、把这些配置放在容器中
 *  --使用配置类，实现WebMvcConfigure接口的addInterceptors方法，然后将我们自定义的拦截器添加到
 *  拦截器路径中
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 目标方法执行之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录检查逻辑
        HttpSession session = request.getSession();
        if(session.getAttribute("userLogin")!=null) {
            //放行
            return true;
        }
        //拦截页面，然后跳转到登录页面
        request.setAttribute("msg","请先登录再访问页面");
        request.getRequestDispatcher( "/login").forward(request,response);
        return false;
    }

    /**
     * 目标方法执行之后
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    /**
     * 页面渲染完成之后
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
