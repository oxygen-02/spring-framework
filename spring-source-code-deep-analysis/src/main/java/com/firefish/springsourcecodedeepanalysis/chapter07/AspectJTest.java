package com.firefish.springsourcecodedeepanalysis.chapter07;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJTest {

	@Pointcut("execution(* *.test(..))")
	public void test() {
	}

	@Before("test()")
	public void beforeTest() {
		System.err.println("aspect @Before...");
	}

	@After("test()")
	public void afterTest() {
		System.err.println("aspect @After...");
	}

	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint p) {
		System.err.println("aspect @Around...before...");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.err.println("aspect @Around...after...");
		return o;
	}
}