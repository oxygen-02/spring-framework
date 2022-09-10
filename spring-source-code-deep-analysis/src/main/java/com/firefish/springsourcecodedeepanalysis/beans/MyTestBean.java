package com.firefish.springsourcecodedeepanalysis.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

public class MyTestBean {


	private String testStr = "testStr";
	// 构造器注入测试

	public MyTestBean(String testStr){
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
