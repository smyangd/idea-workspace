package com.example.damien2cloudstudent.aop;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.example.damien2cloudstudent.bean.DBContextHolder;

@Aspect
@Component
public class DataSourceAop {

    @Pointcut(" execution(* com.example.damien2cloudstudent.service..*.insert*(..)) " +
            "|| execution(* com.example.damien2cloudstudent.service..*.add*(..)) " +
            "|| execution(* com.example.damien2cloudstudent.service..*.update*(..)) " +
            "|| execution(* com.example.damien2cloudstudent.service..*.edit*(..)) " +
            "|| execution(* com.example.damien2cloudstudent.service..*.delete*(..)) " +
            "|| execution(* com.example.damien2cloudstudent.service..*.remove*(..))")
    public void writePointcut() {

    }
    
    @Pointcut("(execution(* com.example.damien2cloudstudent.service..*.select*(..)) " +
            "|| execution(* com.example.damien2cloudstudent.service..*.get*(..))" +
            "|| execution(* com.example.damien2cloudstudent.service..*.find*(..)))")
    public void readPointcut() {

    }


    @Before("writePointcut()")
    public void write() {
        DBContextHolder.master();
    }
    

    @Before("readPointcut()")
    public void read() {
        DBContextHolder.slave();
    }


    /**
     * 另一种写法：if...else...  判断哪些需要读从数据库，其余的走主数据库
     */
//    @Before("execution(* com.example.damien2cloudstudent.service.impl.*.*(..))")
//    public void before(JoinPoint jp) {
//        String methodName = jp.getSignature().getName();
//
//        if (StringUtils.startsWithAny(methodName, "get", "select", "find")) {
//            DBContextHolder.slave();
//        }else {
//            DBContextHolder.master();
//        }
//    }
}