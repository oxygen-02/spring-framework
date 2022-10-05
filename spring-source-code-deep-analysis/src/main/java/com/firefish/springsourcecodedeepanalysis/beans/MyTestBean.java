package com.firefish.springsourcecodedeepanalysis.beans;

/**
 * 功能: 基本bean类.
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-10-05 1:54 PM
 */
public class MyTestBean {


	private String testStr = "testStr";
	// 构造器注入测试

	public MyTestBean(String testStr) {
		this.testStr = testStr;
	}


	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	@Override
	public String toString() {
		return "MyTestBean [str=" + testStr + "]";
	}

}
