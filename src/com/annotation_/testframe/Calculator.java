package com.annotation_.testframe;

/**
 * @author wanghao
 * @date 2022/4/18
 */
public class Calculator {
    @Check
    public void add() {
        System.out.println("1+0=" + (1 + 0));
    }
    @Check
    public void sub() {
        String str = null;
        str.toString();
        System.out.println("1-0=" + (1 - 0));
    }
    @Check
    public void mul() {
        System.out.println("1*0=" + (1 * 0));
    }
    @Check
    public void div() {
        System.out.println("1/0="+(1/0));
    }
}
