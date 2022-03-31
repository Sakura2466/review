package com.multithreading;

/**
 * @author wanghao
 * @version 1.0
 */
public class WaitAndNotify {
    public static void main(String[] args) {
        WANTask wanTask = new WANTask();
        Thread thread1 = new Thread(wanTask);
        Thread thread2 = new Thread(wanTask);
        Thread thread3 = new Thread(wanTask);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (wanTask) {
            wanTask.notifyAll();
        }
    }
}

class WANTask implements Runnable{
    @Override
    public void run() {
        synchronized (this){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程"+Thread.currentThread().getName()+"已被唤醒");
        }
    }
}
