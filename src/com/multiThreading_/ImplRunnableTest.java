package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
public class ImplRunnableTest {
    public static void main(String[] args) {
        ImplRunnable implRunnable = new ImplRunnable();
        Thread thread = new Thread(implRunnable);
        thread.start();
    }
}
