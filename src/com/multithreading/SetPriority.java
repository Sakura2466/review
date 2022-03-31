package com.multithreading;

/**
 * @author wanghao
 * @version 1.0
 */
public class SetPriority {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        int priority = thread.getPriority();
        System.out.println("修改前:"+priority);
        thread.setPriority(Thread.MAX_PRIORITY);
        priority = thread.getPriority();
        System.out.println("修改后:"+priority);
    }
}
