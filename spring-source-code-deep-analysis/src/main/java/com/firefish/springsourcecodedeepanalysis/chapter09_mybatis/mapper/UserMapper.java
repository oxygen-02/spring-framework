package com.firefish.springsourcecodedeepanalysis.chapter09_mybatis.mapper;

import com.firefish.springsourcecodedeepanalysis.chapter09_mybatis.pojo.User;

public interface UserMapper {

    void insertUser(User user);

    User getUser(Integer id);


}
