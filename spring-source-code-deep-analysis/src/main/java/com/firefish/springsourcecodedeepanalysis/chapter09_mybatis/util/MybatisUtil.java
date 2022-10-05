package com.firefish.springsourcecodedeepanalysis.chapter09_mybatis.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 功能: 从 XML 中构建 SqlSessionFactory.
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-09-14 12:17 AM
 */
public class MybatisUtil {
	public static final SqlSessionFactory sqlSessionFactory;

	static {
		String resource = "com/firefish/springsourcecodedeepanalysis/chapter09_mybatis/mybatis-config-version01.xml";
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
