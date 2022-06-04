package org.spring.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.spring.model.Circle;

@Aspect
public class LoggingAspect {

//    @Before("execution(public String getName())") --> independent on class
//    @Before("execution(public String org.spring.model.Circle.getName())") --> dependent on circle class
//    @Before("execution(* get*(..))") --> .. : means zero or more arguments
//    * : means one or more arguments
    @Before("allCircleMethods()")
    public void LoggingAdvice(JoinPoint joinPoint){
    }

//    @Before("allGetters()")
//    public void secondAdvice(){
//        System.out.println("second advice executed");
//    }

    @AfterReturning(pointcut = "args(name)",returning = "returnString")
    public void stringArgumentMethods(String name,String returnString){
        System.out.println("A method that takes String arguments has been called. The value is :" + name + "The output value is : "+returnString);
    }

    @AfterThrowing("args(name)")
    public void exceptionAdvice(String name){
        System.out.println("An exception has been thrown");
    }

    @Pointcut("execution(* get*())")
    public void allGetters(){}

//    @Pointcut("execution(* * org.spring.model.Circle.*(..))") --> All methods of circle class
    @Pointcut("within(org.spring.model.Circle)")
    public void allCircleMethods(){}

}
