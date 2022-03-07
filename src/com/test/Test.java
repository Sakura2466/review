package com.test;

/**
 * @author wanghao
 * @version 1.0
 */
public class Test{
    public static void main(String[] args){
        //获取到当前正在执行任务的线程
        Thread thread = Thread.currentThread();
        //获取到当前正在执行任务的线程所在的线程组
        ThreadGroup tg = thread.getThreadGroup();
        //创建线程组设置线程组名称
        ThreadGroup threadGroup = new ThreadGroup("这个线程组名称叫AA");
        //创建一个线程把线程加入线程组
        Thread thread1 = new Thread(threadGroup,"测试");
        //输出该线程
        System.out.println(thread1);
    }
}
