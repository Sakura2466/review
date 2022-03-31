package com.multithreading.threadstate;

/**
 * @author wanghao
 * @version 1.0
 */
public class TerminatedState {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Thread thread = new Thread(task3);
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
    }
}

class Task3 implements Runnable{
    @Override
    public void run() {
        synchronized (this){
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getState());
        }
    }
}
