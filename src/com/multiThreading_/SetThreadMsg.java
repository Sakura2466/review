package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
public class SetThreadMsg {
    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        thread01.setName("测试修改线程名字");
        System.out.println(thread01.getName());
        thread01.start();
    }
}
