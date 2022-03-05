package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
public class ThreadGroupTest {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        java.lang.ThreadGroup threadGroup = thread.getThreadGroup();
        System.out.println(threadGroup);
        ThreadGroup group1 = new ThreadGroup("线程组01");
        Thread thread1 = new Thread(group1,"线程01");
        System.out.println(group1);
        System.out.println(thread1);
        System.out.println(group1.getName());
        group1.setMaxPriority(8);
        System.out.println(group1.getMaxPriority());

        System.out.println(group1.activeCount());




    }
}
