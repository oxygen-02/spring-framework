package com.firefish.springsourcecodedeepanalysis.mybeanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * 功能: 自定义的BeanPostProcessor.
 * 在bean的初始化方法前后起作用
 *
 * @author Fire Fish
 * @since 2022-09-10 6:15 PM
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("=====");

		// 结合【在bean的初始化方法前后起作用】就可以知道，如果返回null，则表示终止后续处理器的处理，直接返回
		return null;
    }
}
