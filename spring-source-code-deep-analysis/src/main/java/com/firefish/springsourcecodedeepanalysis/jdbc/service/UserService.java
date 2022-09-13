package com.firefish.springsourcecodedeepanalysis.jdbc.service;

import com.firefish.springsourcecodedeepanalysis.jdbc.pojo.User;

import java.util.List;

/**
 * 功能：
 *
 * @author apple
 * @date 2021-11-08 10:51 下午
 */
public interface UserService {

    void save(User user);

    List<User> getUsers();
}
