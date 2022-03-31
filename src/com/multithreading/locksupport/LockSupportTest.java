package com.multithreading.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @author wanghao
 * @version 1.0
 */
public class LockSupportTest {
    public static void main(String[] args) {
        LockSup lockSup = new LockSup();
        Thread thread = new Thread(lockSup);
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LockSupport.unpark(thread);
    }
}

class LockSup implements Runnable{
    @Override
    public void run() {
        System.out.println("等待前");
        LockSupport.park();
        System.out.println("等待后");
    }
}


