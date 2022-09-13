package com.firefish.springsourcecodedeepanalysis.jdbc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能：
 *
 * @author apple
 * @date 2021-11-08 10:50 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private int age;
    private String sex;
}
