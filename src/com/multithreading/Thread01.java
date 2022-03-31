package com.multithreading;

/**
 * @author wanghao
 * @version 1.0
 */
public class Thread01 extends Thread {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println(name);
    }
}
