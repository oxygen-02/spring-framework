package com.firefish.springsourcecodedeepanalysis;

import static org.junit.Assert.assertEquals;

import com.firefish.springsourcecodedeepanalysis.beans.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("application.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		assertEquals("testStr", bean.getTestStr());
	}

	@Test
	public void test_string(){
		String a = "classpath:test.xml";
		int k = a.lastIndexOf('e', a.length() - 3);

	}
}
