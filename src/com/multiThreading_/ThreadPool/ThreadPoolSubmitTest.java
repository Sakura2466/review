package com.multiThreading_.ThreadPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wanghao
 * @version 1.0
 */
public class ThreadPoolSubmitTest {
    public static void main(String[] args) {
        Task2 Task1 = new Task2();
        Task2 Task2 = new Task2();
        Task2 Task3 = new Task2();
        /**
         * 原生创建线程池的方式
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 6, 10L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                new CustomThreadFactory() ,
                new ThreadPoolExecutor.AbortPolicy());
    }
}

class CustomThreadFactory2 implements ThreadFactory {
    private final AtomicInteger i = new AtomicInteger(1);
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("线程"+i.getAndIncrement()+"号");
        return thread;
    }
}

class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}