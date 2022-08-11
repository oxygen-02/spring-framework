package com.firefish.springframework.aop.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


/**
 * 定义一个切面.
 *
 * @author Fire Fish
 */
@Aspect
public class AspectDemo {

	/**
	 * execute（执行）.
	 * execution（执行）
	 */
	@Pointcut("execution(* com.firefish.springframework.aop.service.*Service.*(..))")
	public void pointCut() {

	}

	@Before("pointCut()")
	public void before() {
		System.out.println("=====before======");
	}

	@After("pointCut()")
	public void after() {
		System.out.println("=====after======");
	}

	@AfterThrowing("pointCut()")
	public void afterThrowing() {
		System.out.println("=====AfterThrowing======");
	}

	@AfterReturning("pointCut()")
	public void afterReturning() {
		System.out.println("=====afterReturning======");
	}
}
