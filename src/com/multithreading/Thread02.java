package com.multithreading;

/**
 * @author wanghao
 * @version 1.0
 */
public class Thread02 extends Thread{
    @Override
    public void run() {

        while (true) {
            if (Thread.interrupted()) {
                break;
            }
            System.out.println("运行中..");
        }
    }
}
