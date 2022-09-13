package com.firefish.springsourcecodedeepanalysis.chapter09_mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.firefish.springsourcecodedeepanalysis.chapter09_mybatis.mapper.UserMapper;
import com.firefish.springsourcecodedeepanalysis.chapter09_mybatis.pojo.User;
import com.firefish.springsourcecodedeepanalysis.chapter09_mybatis.util.MybatisUtil;

public class MybatisTest {

	static SqlSessionFactory sqlSessionFactory;

	static {
		sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
	}

	@Test
	public void testAdd() {
		// try-with-resources 特性。
		// session是会话级别的，用完要及时关闭
		try (SqlSession session = sqlSessionFactory.openSession()) {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = new User(null, "tom", 5);
			userMapper.insertUser(user);

			// 这里一定要提交，不然数据进不去数据库中
			session.commit();
		}
	}

	@Test
	public void getUser() {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = userMapper.getUser(1);
			System.out.println(user);
		}
	}
}