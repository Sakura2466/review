package com.multiThreading_;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wanghao
 * @version 1.0
 */
public class ConditionTest {
    public static void main(String[] args) {
        ProData proData = new ProData();
        ShengchanTask shengchanTask = new ShengchanTask(proData);
        XiaofeiTask xiaofeiTask = new XiaofeiTask(proData);
        Thread thread = new Thread(shengchanTask);
        Thread thread1 = new Thread(xiaofeiTask);
        thread.start();
        thread1.start();
    }
}

class ProData{
    private String message;
    private Lock lock = new ReentrantLock();
    private Condition shengchanCondition = lock.newCondition();
    private Condition xiaofeiCondition = lock.newCondition();
    //消费方法
    public String getMessage() throws InterruptedException {
        lock.lock();
        try {
            //如果数据为空,说明数据还未生产
            while (message==null){
                //消费者线程等待
                xiaofeiCondition.await();
            }
            //唤醒所有生产者线程
            shengchanCondition.signalAll();
            return message;
        }finally {
            //消费数据
            message=null;
            lock.unlock();
        }
    }
    //生产方法
    public void setMessage(String message) throws InterruptedException {
        lock.lock();
        try {
            //当数据不为空时,说明消费者还没消费
            while(this.message!=null){
                //使生产者线程等待
                shengchanCondition.await();
            }
            //否则就生产数据
            this.message = message;
            System.out.println("生产:"+this.message);
            //然后唤醒所有消费者消费
            xiaofeiCondition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}

class ShengchanTask implements Runnable{
    private final ProData proData;

    public ShengchanTask(ProData proData) {
        this.proData = proData;

    }


    @Override
    public void run() {
        int a = 0;
        while (true){
            try {
                //调用生产方法生产
                proData.setMessage(++a +"号产品");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class XiaofeiTask implements Runnable{
    private final ProData proData;


    public XiaofeiTask(ProData proData) {
        this.proData = proData;

    }


    @Override
    public void run() {
       while (true){
               try {
                   System.out.println(proData.getMessage()+"已被消费");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

       }
    }
}