package com.multithreading.stampedlock;

import java.util.concurrent.locks.StampedLock;

/**
 * @author wanghao
 * @version 1.0
 */
public class Data {
    private String message;
    private final StampedLock stampedLock = new StampedLock();
    public String getMessage(){
        long rl = stampedLock.readLock();
        try {
            Thread.sleep(100);
            return message;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            stampedLock.unlockRead(rl);
        }
    }
    public void setMessage(String message){
        long wl = stampedLock.writeLock();
        try {
            Thread.sleep(100);
            this.message=message;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            stampedLock.unlockWrite(wl);
        }
    }
}
