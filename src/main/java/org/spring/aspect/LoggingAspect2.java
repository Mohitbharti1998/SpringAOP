package org.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class LoggingAspect2 {



    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){

        Object returnValue = null;

        try {
            System.out.println("Before Advice");
            returnValue = proceedingJoinPoint.proceed();
            System.out.println("After returning");
        } catch (Throwable e) {
            System.out.println("After Throwing");
        }

        System.out.println("After finally");

        return returnValue;
    }
}
