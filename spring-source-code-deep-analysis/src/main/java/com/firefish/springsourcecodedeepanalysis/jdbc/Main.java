package com.firefish.springsourcecodedeepanalysis.jdbc;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.firefish.springsourcecodedeepanalysis.jdbc.pojo.User;
import com.firefish.springsourcecodedeepanalysis.jdbc.service.UserService;

/**
 * 功能：
 *
 * @author apple
 * @date 2021-11-08 11:27 下午
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/firefish/springsourcecodedeepanalysis/jdbc/application.xml");
        UserService userService = ctx.getBean(UserService.class);

        User user = new User();
        user.setName("张三");
        user.setAge(10);
        user.setSex("男");

        // 保存一条记录
        userService.save(user);


        List<User> users =  userService.getUsers();
        System.out.println("++++++++++得到所有的User");

        users.forEach(t -> {
            System.out.println(t);
        });
    }
}
