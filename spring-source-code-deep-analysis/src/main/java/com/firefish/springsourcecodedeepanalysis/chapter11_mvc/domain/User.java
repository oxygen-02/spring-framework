package com.firefish.springsourcecodedeepanalysis.chapter11_mvc.domain;

import lombok.Data;

/**
 * 功能: 实体类.
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-10-06
 */
@Data
public class User {
	private String username;
	private Integer age;
}
