package com.firefish.springframework.aop.entity;


/**
 * 功能：模拟切面业务中真实的对象（非切面）.
 *
 * @author Fire Fish
 * @since 2021-12-22 11:09 下午
 */
public class HelloAopBean {

	public String print(String... params) {
		System.out.println("=====真实的业务方法=========");
		return "success";
	}
}
