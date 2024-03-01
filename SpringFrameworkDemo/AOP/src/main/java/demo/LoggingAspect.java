package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
//    @After("execution(* *.*.checkout(String) )")
    public void Beforelogger(JoinPoint jp){
        System.out.println("Before Loggers with Args::  "+jp.getArgs()[0].toString());
        System.out.println(jp.getSignature());
    }


    @After("execution(* *.*.checkout(String) )")
    public void AfterLogger(){
        System.out.println("After Logger");
    }

    @Pointcut("execution(* *.*.quantity(..))")
    public void afterReturningPointCut(){
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(int retVal){
        System.out.println("After Returning :   "+retVal);
    }

}
