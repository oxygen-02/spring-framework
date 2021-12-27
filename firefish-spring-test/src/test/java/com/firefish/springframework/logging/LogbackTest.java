package com.firefish.springframework.logging;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能：
 *      使用apache-loggin接口，log4j2实现类
 * @author Fire Fish
 * @since 2021-12-26 10:36 上午
 */
//@Slf4j        // 也可以用slf4j
public class LogbackTest {
	public final Logger log = LoggerFactory.getLogger(LogbackTest.class);

	@Test
	public void test() {
		log.info("aaaa");
		log.warn("aaaa");
		log.error("aaaa");
	}
}
