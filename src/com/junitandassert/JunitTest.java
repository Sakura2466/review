package com.junitandassert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author wanghao
 * @date 2022/4/14
 */
public class JunitTest {

    @Test
    public void add(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        Assertions.assertEquals(3, result);
    }
}
