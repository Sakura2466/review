package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
public class SetThreadMsg {
    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        thread01.setThread01name("main线程");
        String thread01name =  thread01.getThread01name();
        thread01.setName(thread01name);
        System.out.println(thread01.getName());
        thread01.run();
    }
}
