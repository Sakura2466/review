package com.multiThreading_;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author wanghao
 * @version 1.0
 */
public class ImplCallableTest {
    public static void main(String[] args) {
        ImplCallable implCallable = new ImplCallable();
        FutureTask<String> stringFutureTask = new FutureTask<String>(implCallable);
        Thread thread = new Thread(stringFutureTask);
        thread.start();
        try {
            String str = stringFutureTask.get();
            System.out.println(str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
