package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
public class GetThreadMsg {
    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        Thread thread = Thread01.currentThread();
        thread01.start();
        System.out.println("当前正在执行的线程为："+thread);
        System.out.println("当前正在执行的线程名字为："+thread.getName());
        System.out.println("当前正在执行的线程优先级为："+thread.getPriority());
        System.out.println("当前正在执行的线程组名字为："+thread.getThreadGroup().getName());
    }
}
