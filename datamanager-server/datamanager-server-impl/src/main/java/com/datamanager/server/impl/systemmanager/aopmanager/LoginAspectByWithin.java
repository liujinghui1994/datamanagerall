package com.datamanager.server.impl.systemmanager.aopmanager;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @program: com.umbrella.core.common.aop_manage
 * @description: 检查登陆AOP切面
 * 匹配方法execution()
 * 匹配注解@target
 * 匹配注解@args
 * 匹配注解@within
 * 匹配注解@annotation
 * 匹配包或类型within
 * 匹配对象this
 * 匹配对象bean
 * 匹配对象target
 * 匹配参数args
 * @author: liujinghui
 * @create: 2019-02-10 14:31
 **/
@Aspect
@Component
public class LoginAspectByWithin {
//    @Pointcut("within(aop_manage.login.LoginController)")
//    public void verifyLoginByWithin(){}
//
//    @Before("verifyLoginByWithin()")
//    public void beforeVerifyLoginByWithin(){
//        System.out.println("执行校验登陆状态。。。");
//    }
}
