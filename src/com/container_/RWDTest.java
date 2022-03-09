package com.container_;

/**
 * @author wanghao
 * @version 1.0
 */
public class RWDTest {
    public static void main(String[] args) {
        RWDictionary rwDictionary = new RWDictionary();
        WriteTask writeTask = new WriteTask(rwDictionary);
        ReadTask readTask = new ReadTask(rwDictionary);
        Thread thread1 = new Thread(writeTask);
        Thread thread2 = new Thread(writeTask);
        Thread thread3 = new Thread(writeTask);
        Thread thread4 = new Thread(readTask);
        Thread thread5 = new Thread(readTask);
        Thread thread6 = new Thread(readTask);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
