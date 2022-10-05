package com.firefish.springsourcecodedeepanalysis.chapter10_tx.xml;

import org.springframework.transaction.annotation.Transactional;

/**
 * 功能: 在接口上声明事务.
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-10-05 1:40 PM
 */
@Transactional(rollbackFor = RuntimeException.class)
public interface UserService {

    /**
     * 有事务
     * @param user
     */
    void saveWithTransaction(User user);

    /**
     * 没有事务
     * @param user
     */
    void saveWithoutTransaction(User user);

}
