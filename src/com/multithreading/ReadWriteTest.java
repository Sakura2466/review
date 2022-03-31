package com.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author wanghao
 * @version 1.0
 */
public class ReadWriteTest {
    public static void main(String[] args) {
        RWTask rwTask = new RWTask();
        Thread thread = new Thread(rwTask);
        Thread thread1 = new Thread(rwTask);
        Thread thread2 = new Thread(rwTask);
        thread.start();
        thread1.start();
        thread2.start();

    }
}

class RWTask implements Runnable{
    //初始化一个读写公平锁
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock(true);
    //调用读写锁的readLock()方法得到读锁
    private Lock writeLock = readWriteLock.writeLock();
    @Override
    public void run() {
        writeLock.lock();
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            writeLock.unlock();
        }
    }
}