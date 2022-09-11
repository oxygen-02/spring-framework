package com.firefish.springsourcecodedeepanalysis.chapter07;

import lombok.Data;

@Data
public class TestBean {

    private String testStr = "testStr";

    public void test() {
        System.err.println("test...");
    }
}
