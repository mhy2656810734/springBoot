package com.example.demo.moduls;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mahaiyang
 * @date 2024/3/25 16:40
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setContentType("application/json;charset=utf8");
        response.getWriter().println("{\"code\":-1,\"msg\":\"登录失败\",\"data\":\"\"}");
        return false;
    }
}
