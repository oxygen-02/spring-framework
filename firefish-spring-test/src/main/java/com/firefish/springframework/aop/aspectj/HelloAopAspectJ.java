package com.firefish.springframework.aop.aspectj;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 功能：入门切面模拟.
 *
 * @author Fire Fish
 * @since 2021-12-22 11:11 下午
 */
@Aspect
@Slf4j
public class HelloAopAspectJ {

	// jackson
	ObjectMapper objectMapper = new ObjectMapper();

	//	protected final Log logger = LogFactory.getLog(getClass());
	protected static final Log logger = LogFactory.getLog(HelloAopAspectJ.class);


	@Pointcut("execution(* com.firefish.springframework.aop.entity.HelloAopBean.*(String...))")
	public void test() {

	}

	@Before("test()")
	public void beforeTest(JoinPoint joinpoint) {
		if (log.isDebugEnabled()) {
			String argValues = null;
			try {
				argValues = objectMapper.writeValueAsString(joinpoint.getArgs());
			} catch (JsonProcessingException e) {

			}
			log.debug("方法的参数是: [{}]", argValues);
		}
		log.error("before");
	}

	@After("test()")
	public void afterTest(JoinPoint joinpoint) {
		System.out.println("after");
	}

	@AfterReturning(value = "test()", returning = "ret")
	public void afterReturnTest(Object ret, JoinPoint joinPoint, JoinPoint joinPoint1, JoinPoint joinPoint2) {
		log.error("方法的返回值是: [{}]", ret);
	}

	// 这里能不能用Exception接受参数？？？
	@AfterThrowing(value = "test()", throwing = "ex")
	public void afterReturnTest(JoinPoint joinPoint, Throwable ex) {
		log.error("方法的异常是: [{}]", ex);
	}


	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint p) {
		log.error("before1");
		Object result = null;
		try {
			// 调用p的proceed方法，使调用顺序重新由具体的拦截器回到"核心调用器"
			if(log.isDebugEnabled()){
				log.debug("调用顺序重新由拦截器返回核心调用器");
			}
			result = p.proceed();
		}
		catch (Throwable th) {
			log.error("around拦截器执行发生错误, 异常是: [{}]",th);
		}
		log.error("after1");
		return result;
	}
}
