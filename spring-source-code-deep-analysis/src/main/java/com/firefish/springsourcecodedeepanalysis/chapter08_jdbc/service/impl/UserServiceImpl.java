package com.firefish.springsourcecodedeepanalysis.chapter08_jdbc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

import com.firefish.springsourcecodedeepanalysis.chapter08_jdbc.mapper.UserRowMapper;
import com.firefish.springsourcecodedeepanalysis.chapter08_jdbc.pojo.User;
import com.firefish.springsourcecodedeepanalysis.chapter08_jdbc.service.UserService;

/**
 * 功能：
 *
 * @author apple
 * @date 2021-11-08 10:52 下午
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save(User user) {
		String sql = "INSERT INTO user(name, age, sex) VALUES(?, ?, ?)";
		Object[] params = new Object[]{user.getName(), user.getAge(), user.getSex()};
		int update = jdbcTemplate.update(sql, params);
		System.out.println(update);
	}

	@Override
	public List<User> getUsers() {

		String sql = "SELECT  * FROM user";
		List<User> result = jdbcTemplate.query(sql, new UserRowMapper());
		return result;
	}
}
