package com.firefish.springsourcecodedeepanalysis.i18n;

import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring定义的国际化接口是【MessageSource】
 * 功能: 测试国际化之 ResourceBundleMessageSource 类.
 * 1、IDEA可以新建resource bundle 文件（有特定格式的）
 * 2、如果你测试结果是乱码，那么你需要设置idea对propertes文件的编码
 *
 *
 * 至于原理：无非是用类加载器加载文件（刚刚是满足特定规则的文件：【basename_" + locale的信息 + ".properties"】
 * 说细节一下：
 * 1、获取 ResourceBundle（就是信息的封装，可以理解为一个map，key=[basename+locale]，value=值）
 * 2、拿着getMessage的code去bundle的lookup属性中查找（其实就是去map中查找，lookup就是对properties文件的内容）
 * 3、到这里就获取到了 properties 文件中配置的内容，然后就封装为javase中的诸如[MessageFormat、DateFormat]
 * 4、最后就是javase中的对MessageFormat应用占位符参数
 *
 * @author Fire Fish
 * @since 2022-09-11 9:07 AM
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext app =
				new ClassPathXmlApplicationContext("com/firefish/springsourcecodedeepanalysis/i18n/application.xml");
		Object[] param = {"John", new GregorianCalendar().getTime()};

		String test1 = app.getMessage("test", param, Locale.US);
		String test2 = app.getMessage("test", param, Locale.CHINA);
		System.out.println(test1);
		System.out.println(test2);
	}
}