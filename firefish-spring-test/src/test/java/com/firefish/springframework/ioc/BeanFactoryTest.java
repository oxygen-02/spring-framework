package com.firefish.springframework.ioc;

import com.firefish.springframework.ioc.entity.Hello;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 功能：
 *
 * @author Fire Fish
 * @since 2021-12-12 10:08 上午
 */
public class BeanFactoryTest {
	@Test
	public void test() {
		Resource resource;
		/**
		 * 注: /Users/Fire Fish/Documents/Work/Development/github/spring-framework-official/myspringframeworktest/src/test/java/com/firefish/springframework/ioc/BeanFactoryTest.java使用或覆盖了已过时的 API。
		 * 注: 有关详细信息, 请使用 -Xlint:deprecation 重新编译。
		 * 1 个警告
		 */
		BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("ioc/applicationContext.xml"));
		Hello bean = ctx.getBean(Hello.class);

		System.out.println(bean);
	}
}
