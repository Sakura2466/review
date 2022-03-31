package com.multithreading.threadpool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wanghao
 * @version 1.0
 */
public class RejectedExecutionHandlerTest {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(2),

                new ThreadPoolExecutor.DiscardOldestPolicy());
        threadPoolExecutor.execute(new CustomTask(1));
        threadPoolExecutor.execute(new CustomTask(2));
        threadPoolExecutor.execute(new CustomTask(3));
        threadPoolExecutor.execute(new CustomTask(4));
        threadPoolExecutor.shutdown();
    }
}

class CustomTask implements Runnable{
    private final int index;

    public CustomTask(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+index);
    }
}
