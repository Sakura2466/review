package com.multiThreading_.StampedLock;

/**
 * @author wanghao
 * @version 1.0
 */
public class WriteTask implements Runnable{
    private Data data;

    public WriteTask(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            data.setMessage("测试"+i++);
        }
    }
}
