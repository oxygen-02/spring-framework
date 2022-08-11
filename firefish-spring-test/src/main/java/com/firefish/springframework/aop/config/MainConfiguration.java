package com.firefish.springframework.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.firefish.springframework.aop.aspectj.AspectDemo;
import com.firefish.springframework.aop.service.impl.BusinessServiceImpl;

/**
 * 功能：主配置类.
 * 1、引入aop的jar包
 * 2、启用aop功能（@EnableXxx）
 * 3、编写"切面类"【AspectDemo】；在类中写"切入点"【pointCut】；在类中写"切入的方法"【printParam】
 * 4、写业务类【BusinessDemo】
 * 5、吧"切面类"和"业务类"注册到容器中
 * 6、编写"主配置类"【MainConfiguration】
 * 6、启动容器开始测试
 *
 * @author Fire Fish
 * @since 2021/12/26
 */


@Configuration
//@EnableAspectJAutoProxy
@EnableAspectJAutoProxy(exposeProxy = true)
public class MainConfiguration {


	@Bean
	public AspectDemo aspectDemo() {
		return new AspectDemo();
	}

	@Bean
	public BusinessServiceImpl businessDemo() {
		return new BusinessServiceImpl();
	}
}
