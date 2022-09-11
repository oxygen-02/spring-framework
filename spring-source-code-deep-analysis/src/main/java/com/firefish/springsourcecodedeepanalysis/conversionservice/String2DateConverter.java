package com.firefish.springsourcecodedeepanalysis.conversionservice;

import java.util.Date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import org.springframework.core.convert.converter.Converter;

/**
 * 功能: 转换服务.
 *
 * @author Fire Fish
 * @since 2022-09-11 5:24 PM
 */
public class String2DateConverter implements Converter<String, Date> {
	@Override
	public Date convert(String source) {
		DateTime dateTime = DateUtil.parseDateTime(source);
		return dateTime;
	}
}
