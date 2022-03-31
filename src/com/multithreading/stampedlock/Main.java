package com.multithreading.stampedlock;

/**
 * @author wanghao
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        ReadTask readTask = new ReadTask(data);
        WriteTask writeTask = new WriteTask(data);
        Thread thread = new Thread(readTask);
        Thread thread1 = new Thread(writeTask);
        thread.start();
        thread1.start();
    }
}
