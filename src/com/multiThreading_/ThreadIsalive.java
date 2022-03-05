package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
public class ThreadIsalive {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        System.out.println(thread.isAlive());
        thread.start();
        System.out.println(thread.isAlive());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.isAlive());
    }
}


class Task implements Runnable{
    @Override
    public void run() {

    }
}
