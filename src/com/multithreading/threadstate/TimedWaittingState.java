package com.multithreading.threadstate;

/**
 * @author wanghao
 * @version 1.0
 */
public class TimedWaittingState {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Thread thread = new Thread(task2);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());

    }
}

class Task2 implements Runnable{
    @Override
    public void run() {
        synchronized (this){
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getState());
        }
    }
}
