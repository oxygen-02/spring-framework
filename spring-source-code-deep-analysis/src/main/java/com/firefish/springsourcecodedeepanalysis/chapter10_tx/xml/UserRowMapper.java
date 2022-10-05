package com.firefish.springsourcecodedeepanalysis.chapter10_tx.xml;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.firefish.springsourcecodedeepanalysis.chapter08_jdbc.pojo.User;

/**
 * 功能: 数据表映射类.
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-10-05 1:46 PM
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
