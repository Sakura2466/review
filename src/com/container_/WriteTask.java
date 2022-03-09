package com.container_;

/**
 * @author wanghao
 * @version 1.0
 */
public class WriteTask implements Runnable{
    private RWDictionary rwd;

    public WriteTask(RWDictionary rwd) {
        this.rwd = rwd;
    }

    @Override
    public void run() {
       int i = 0;
       while (true){
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           String name = Thread.currentThread().getName();
           rwd.put("WH", name+"---"+i++);
       }
    }
}
