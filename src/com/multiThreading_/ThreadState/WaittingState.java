package com.multiThreading_.ThreadState;

/**
 * @author wanghao
 * @version 1.0
 */
public class WaittingState {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Thread thread = new Thread(task1);
        thread.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        synchronized (task1){
            System.out.println(thread.getState());
            task1.notify();
            System.out.println(thread.getState());
        }

    }
}
class Task1 implements Runnable{
    @Override
    public void run() {
        synchronized (this){
            System.out.println(Thread.currentThread().getState());
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getState());
        }
    }
}

