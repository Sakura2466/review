package com.multiThreading_.ThreadState;

/**
 * @author wanghao
 * @version 1.0
 */
public class NewState {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        Thread.State state = thread.getState();
        System.out.println(state);
    }
}


