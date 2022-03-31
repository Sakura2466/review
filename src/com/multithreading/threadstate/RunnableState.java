package com.multithreading.threadstate;

/**
 * @author wanghao
 * @version 1.0
 */
public class RunnableState {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        System.out.println(thread.getState());
    }
}
