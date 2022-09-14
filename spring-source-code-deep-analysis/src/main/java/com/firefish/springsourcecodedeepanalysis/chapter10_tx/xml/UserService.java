package com.firefish.springsourcecodedeepanalysis.chapter10_tx.xml;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.firefish.springsourcecodedeepanalysis.chapter10_tx.xml.User;

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
