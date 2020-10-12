package com.example.demo.aspects;

import java.util.ArrayList;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Aspect
@EnableAspectJAutoProxy
@Slf4j
public class LoggingAspect {

	
	@Before("execution(* com.example.demo.services.BookDaoImpl.*(..))")
	public void logBefore(JoinPoint jp)
	{
		log.info(jp.getSignature().getName()+"  called");
	}
	
	@Around(value="execution(public String[] com.example.demo.services.BookDaoImpl.findAll(..))")
	public Object printUpper(ProceedingJoinPoint jp) throws Throwable
	{
		
		log.info("called after");
		
		
		Object obj=jp.proceed();
		
		String [] list=(String[])obj;
		
		for(int i=0;i<list.length;i++)
		{
			list[i]=list[i].toUpperCase();
		}
		
		return (Object)list;
		
//		Object obj=(output.toString().toUpperCase());
//		return obj;
	}
	
	
}
