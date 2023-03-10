package com.firefish.springsourcecodedeepanalysis.chapter08_jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.firefish.springsourcecodedeepanalysis.chapter08_jdbc.pojo.User;

/**
 * 功能：
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @date 2021-11-08 11:08 下午
 */
public class UserRowMapper implements RowMapper<User> {


	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new User(rs.getInt("id"),
				rs.getString("name"),
				rs.getInt("age"),
				rs.getString("sex"));
	}
}
