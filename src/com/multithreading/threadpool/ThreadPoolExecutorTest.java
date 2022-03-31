package com.multithreading.threadpool;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wanghao
 * @version 1.0
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();
        /**
         * 线程池另外一种执行任务的方法：submit()
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 6, 10L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                new CustomThreadFactory() ,
                new ThreadPoolExecutor.AbortPolicy());
        threadPoolExecutor.execute(task1);
        threadPoolExecutor.execute(task2);
        threadPoolExecutor.execute(task3);
        threadPoolExecutor.shutdown();
    }
}

class CustomThreadFactory implements ThreadFactory {
    private final AtomicInteger i = new AtomicInteger(1);
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("线程"+i.getAndIncrement()+"号");
        return thread;
    }
}

class Task implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
