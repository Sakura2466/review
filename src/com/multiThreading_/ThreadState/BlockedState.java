package com.multiThreading_.ThreadState;

/**
 * @author wanghao
 * @version 1.0
 */
public class BlockedState {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        synchronized (task){
            thread.start();
            System.out.println(thread.getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getState());
        }

    }
}
class Task implements Runnable{
    @Override
    public void run() {
        synchronized (this){
            System.out.println(Thread.currentThread().getState());
        }
    }
}
