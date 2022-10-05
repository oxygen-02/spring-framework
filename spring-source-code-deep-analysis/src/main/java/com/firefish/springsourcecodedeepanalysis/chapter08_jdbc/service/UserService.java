package com.firefish.springsourcecodedeepanalysis.chapter08_jdbc.service;

import com.firefish.springsourcecodedeepanalysis.chapter08_jdbc.pojo.User;

import java.util.List;

/**
 * 功能：
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @date 2021-11-08 10:51 下午
 */
public interface UserService {

    void save(User user);

    List<User> getUsers();
}
