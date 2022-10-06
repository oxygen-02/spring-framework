package com.firefish.springsourcecodedeepanalysis.chapter11_mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.firefish.springsourcecodedeepanalysis.chapter11_mvc.domain.User;

/**
 * 功能：
 *
 * @author apple
 * @date 2021-11-17 12:52 上午
 */
public class UserController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ArrayList<User> userList = new ArrayList<>();
		User user1 = new User();
		user1.setUsername("张三");
		user1.setAge(27);
		User user2 = new User();
		user2.setUsername("李四");
		user2.setAge(37);
		userList.add(user1);
		userList.add(user2);


		return new ModelAndView("userList", "users", userList);
	}
}