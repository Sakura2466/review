package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
public class InterruptedThread02 {
    public static void main(String[] args) throws InterruptedException {
        Thread02 thread02 = new Thread02();
        Thread thread = new Thread(thread02);
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();

    }
}
