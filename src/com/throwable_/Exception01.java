package com.throwable_;

/**
 * @author wanghao
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        try {
            String name = "测试";
            int a = Integer.parseInt(name);
            System.out.println(a);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("继续执行");
    }
}
