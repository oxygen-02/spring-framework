package com.firefish.springsourcecodedeepanalysis.chapter10_tx.xml;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


/**
 * 功能: 用户服务类.
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-10-05
 */
public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void saveWithTransaction(User user) {
        doSave(user);
    }

    private void doSave(User user) {
        jdbcTemplate.update("INSERT INTO user(name, age, sex) VALUES (?, ?, ?)",
                new Object[] {user.getName(), user.getAge(), user.getSex()});

        int x = 1 / 0;
    }

    @Override
    public void saveWithoutTransaction(User user) {
        doSave(user);
    }
}
