package com.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wanghao
 * @version 1.0
 */
public class LockInterruptibly {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        LiTask liTask = new LiTask(lock);
        Thread thread = new Thread(liTask);
        Thread thread1 = new Thread(liTask);
        thread.start();
        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.interrupt();
    }
}

class LiTask implements Runnable{
    private Lock lock;

    public LiTask(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            lock.lockInterruptibly();
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+"执行了任务");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"被中断");
            return;
        }finally {
            lock.unlock();
        }
    }
}
