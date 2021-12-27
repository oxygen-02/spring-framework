package com.firefish.springframework.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * 功能：
 * 1、使用commons.logging，结合log4j2 的测试类
 * 2、配置文件放在test/resource/log4j2-test.xml（必须要叫这个名字否则会加载到别的模块的日志配置）
 * @author Fire Fish
 * @since 2021-12-26 9:59 上午
 */

public class Log4j2Test {
	// 使用的必须是接口（commons.logging的日志接口）
	public final Log logger = LogFactory.getLog(Log4j2Test.class);

	@Test
	public void test() {
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}
}
