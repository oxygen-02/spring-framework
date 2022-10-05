package com.firefish.springsourcecodedeepanalysis.chapter09_mybatis;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.firefish.springsourcecodedeepanalysis.chapter09_mybatis.mapper.UserMapper;

/**
 * 功能: MapperFactoryBean 版本的mybatis测试.
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-09-14 1:26 AM
 */
public class MybatisVersion02Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/firefish/springsourcecodedeepanalysis/chapter09_mybatis/application-version02.xml");
		UserMapper userMapper = (UserMapper) context.getBean("userMapper");
		System.out.println(userMapper.getUser(1));

	}
}
