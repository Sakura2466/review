package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
public class DeadLockTest {
    public static void main(String[] args) {
        LockA lockA = new LockA();
        LockB lockB = new LockB();
        lockA.start();
        lockB.start();

    }
}

class LockA extends Thread{
    @Override
    public void run() {
        printA();
    }

    public static synchronized void printA(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("A");
        LockB.printB();
    }

}

class LockB extends Thread{
    @Override
    public void run() {
        printB();
    }
    public static synchronized void printB(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B");
        LockA.printA();
    }

}