package com.firefish.springsourcecodedeepanalysis.mycontext;

import com.firefish.springsourcecodedeepanalysis.beans.MyTestBean;
import org.springframework.context.ApplicationContext;

/**
 * 启动时如果不设置 username 环境变量则报错
 */
public class MyContextTest {

	public static void main(String[] args) {
		ApplicationContext context = new MyContext("application.xml");
		MyTestBean bean = (MyTestBean) context.getBean("myTestBean");
		System.out.println(bean);
	}
}
