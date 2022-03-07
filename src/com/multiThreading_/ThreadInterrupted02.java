package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
public class ThreadInterrupted02 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("当前正在执行的线程是否被中断："+thread.isInterrupted());
        thread.interrupt();
        System.out.println("当前正在执行的线程是否被中断："+thread.isInterrupted());
        while (!(thread.isInterrupted())){
            System.out.println("中断状态");
        }
    }
}

