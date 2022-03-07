package com.test;

/**
 * @author wanghao
 * @version 1.0
 */
class IsAlive implements Runnable{
    @Override
    public void run(){
        try {
            //使正在执行的线程休眠3秒
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class IsAliveTest{
    public static void main(String[] args){
        IsAlive ia = new IsAlive();
        Thread thread = new Thread(ia);
        thread.start();
        System.out.println("线程thread是否存活"+thread.isAlive());
        try {
            //使正在执行的线程休眠3秒
            Thread.sleep(5000);
            System.out.println("线程thread是否存活"+thread.isAlive());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}