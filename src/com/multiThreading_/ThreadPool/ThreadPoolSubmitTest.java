package com.multiThreading_.ThreadPool;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wanghao
 * @version 1.0
 */
public class ThreadPoolSubmitTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Task2 task1 = new Task2();
      /*Task2 task2 = new Task2();
        Task2 task3 = new Task2();*/
        /**
         * 测试Submit提交任务的方式
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),//链式线程队列
                new CustomThreadFactory() ,//自定义的线程创建工厂
                new ThreadPoolExecutor.AbortPolicy());//任务拒绝策略
        /*Future<Integer> result = threadPoolExecutor.submit(task1);
        Future<Integer> result2 = threadPoolExecutor.submit(task1);
        boolean cancel = result2.cancel(true);
        System.out.println("任务是否取消成功："+cancel);
        System.out.println(result2.isCancelled());
        //从Future对象获取任务返回值
        Integer s = result2.get();
        System.out.println(s);*/
/*
        Future<Integer> future = threadPoolExecutor.submit(task1);
        Integer result = future.get();
        System.out.println(result);
        boolean cancel = future.cancel(false);
        System.out.println("任务是否取消成功"+cancel);
        System.out.println("任务是否已经取消"+future.isCancelled());*/
        Future<Integer> future = threadPoolExecutor.submit(task1);
        System.out.println("任务是否完成"+future.isDone());
        boolean cancel = future.cancel(true);
        System.out.println("任务是否取消成功"+cancel);
        System.out.println("任务是否已经取消"+future.isCancelled());
        Integer result = future.get();
        System.out.println(result);


        threadPoolExecutor.shutdown();

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

class Task2 implements Callable {

    @Override
    public Integer call() throws Exception {
        int i = 0 ;
        while (!Thread.currentThread().isInterrupted()){
            i++;
        }
        System.out.println(i);
        return 1+1;
    }
}