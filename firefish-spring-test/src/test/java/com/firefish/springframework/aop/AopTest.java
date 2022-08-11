package com.firefish.springframework.aop;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.firefish.springframework.aop.config.MainConfiguration;
import com.firefish.springframework.aop.service.IBusinessService;


public class AopTest {

	/**
	 * 测试aop的流程
	 * 如：1、注入了那些bean
	 * 2、什么时候用到了这些bean
	 * 3、这些bean的功能是什么
	 */
	@Test
	public void test01() {

		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MainConfiguration.class);


		/**
		 * //1、最基础的aop注册了这些bean
		 * org.springframework.context.annotation.internalConfigurationAnnotationProcessor
		 * org.springframework.context.annotation.internalAutowiredAnnotationProcessor
		 * org.springframework.context.annotation.internalRequiredAnnotationProcessor
		 * org.springframework.context.annotation.internalCommonAnnotationProcessor
		 * mainConfiguration
		 * org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor
		 * org.springframework.aop.config.internalAutoProxyCreator
		 * aspectDemo
		 * businessDemo
		 *
		 * //2、aop的流程从@EnableAspectJAutoProxy注解开始
		 *      --->@Import(AspectJAutoProxyRegistrar.class)
		 *          ---->注册了org.springframework.aop.config.internalAutoProxyCreator=AnnotationAwareAspectJAutoProxyCreator【这是一个非常特别的类，它是BeanPostProcessor】
		 *
		 * // 3、看AnnotationAwareAspectJAutoProxyCreator类在什么时候注册，什么时候被用到，什么功能
		 *      --->3.1、通过@EnableAspectAutoProxy注解注册
		 *      --->3.2、作为后置处理器的时候被调用
		 *          --->在postBeanProcessor被调用【因为它实现了Aware、BeanPostProcessor接口，所以调用setBeanFactroy和before方法和afterInit方法】
		 *      --->3.3、
		 */
		String[] beanDefinitionNames = app.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}


		IBusinessService bean = app.getBean("businessDemo", IBusinessService.class);
//        int devide = bean.devide(2, 1);
		bean.print();


	}


	@Test
	public void test02() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MainConfiguration.class);
		IBusinessService bean = app.getBean("businessDemo", IBusinessService.class);
		bean.devide(1, 2);
	}


	@Test
	public void test03() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MainConfiguration.class);
		IBusinessService bean = app.getBean("businessDemo", IBusinessService.class);
		bean.selfInvoke();
	}
}
