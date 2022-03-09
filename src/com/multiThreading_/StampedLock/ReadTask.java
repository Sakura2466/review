package com.multiThreading_.StampedLock;

/**
 * @author wanghao
 * @version 1.0
 */
public class ReadTask implements Runnable{
    private Data data;

    public ReadTask(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(data.getMessage());
        }
    }
}
