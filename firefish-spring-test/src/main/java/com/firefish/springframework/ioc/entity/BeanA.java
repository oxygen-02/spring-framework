package com.firefish.springframework.ioc.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 功能：演示ioc的循环引用2个类中的一个.
 *
 * @author Fire Fish
 * @since 2021-12-12 10:52 上午
 */
@Component
public class BeanA {

	@Autowired
	private BeanB beanB;
}
