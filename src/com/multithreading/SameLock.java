package com.multithreading;



/**
 * @author wanghao
 * @version 1.0
 */
public class SameLock {
    public static void main(String[] args) {
        SameLockTask sameLockTask = new SameLockTask();
        Thread thread1 = new Thread(sameLockTask);
        Thread thread2 = new Thread(sameLockTask);
        sameLockTask.lock1 = SameLockTask.class;
        sameLockTask.lock2 = Thread.class;
        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sameLockTask.setFlag(false);
        thread2.start();

    }
}

class SameLockTask implements Runnable{
    private boolean flag = true;
    public  Class lock1;
    public  Class lock2;
    @Override
    public void run() {
        if(flag){
            synchronized (lock1) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" "+
                        "线程此时用的锁是"+lock1);
            }
        }else{
            synchronized (lock2) {
                 System.out.println(Thread.currentThread().getName()+" "+
                        "线程此时用的锁是"+lock2);
            }
        }
    }
    public void setFlag(boolean falg){
        this.flag=falg;
    }
}