package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

/**
 * @author mahaiyang
 * @date 2024/3/22 17:21
 */
@Aspect
@Component
public class UserAop {
//    @Pointcut("execution(* com.example.demo.controller.UserController.*(..))")
//    public void pointCut() {
//
//    }
////    @Before("pointCut()")
////    public void doBefore() {
////        System.out.println("执行了前置通知"+ LocalTime.now());
////    }
//    @Around("pointCut()")
//    public void doAround(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("开始执行环绕通知");
//        // 执行拦截方法
//        Object object = joinPoint.proceed();
//        System.out.println("结束环绕通知");
//    }
}
