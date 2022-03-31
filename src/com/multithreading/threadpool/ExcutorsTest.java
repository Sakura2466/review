package com.multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wanghao
 * @version 1.0
 */
public class ExcutorsTest {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task1 task2 = new Task1();
        Task1 task3 = new Task1();
        /**
         * 该方式有内存耗尽的风险，不建议使用
         */
        ExecutorService threadPool = Executors.newCachedThreadPool();

        threadPool.execute(task1);
        threadPool.execute(task2);
        threadPool.execute(task3);
        threadPool.shutdown();
    }
}

class CustomThreadFactory1 implements ThreadFactory {
    private final AtomicInteger i = new AtomicInteger(1);
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("线程"+i.getAndIncrement()+"号");
        return thread;
    }
}

class Task1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
