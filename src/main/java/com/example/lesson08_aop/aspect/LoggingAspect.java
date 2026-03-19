package com.example.lesson08_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Aspect that logs method execution in the service layer.
 */
@Aspect
@Component
public class LoggingAspect {

    /**
     * Logs a message before any method in the service package executes.
     */
    @Before("execution(* com.example.lesson08_aop.service.*.*(..))")
    public void logBefore() {

        System.out.println("[LOG] Method bắt đầu chạy...");
    }

    /**
     * Logs a message after any method in the service package executes.
     */
    @After("execution(* com.example.lesson08_aop.service.*.*(..))")
    public void logAfter() {

        System.out.println("[LOG] Method kết thúc.");
    }

    /**
     * Measures and logs the execution time of any method in the service package.
     * @param joinPoint the join point representing the method
     * @return the result of the method execution
     * @throws Throwable if the target method throws any exception
     */
    @Around("execution(* com.example.lesson08_aop.service.*.*(..))")
    public Object measureTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();
        System.out.println("[TIMER] " + joinPoint.getSignature().getName()
                + " chạy trong: " + (end - start) + "ms");
        return result;
    }

}
