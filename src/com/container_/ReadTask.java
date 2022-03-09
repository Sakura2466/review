package com.container_;

/**
 * @author wanghao
 * @version 1.0
 */
public class ReadTask implements Runnable{
    private RWDictionary rwd;

    public ReadTask(RWDictionary rwd) {
        this.rwd = rwd;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String[] keys = rwd.getKeys();
            for (String key : keys) {
                Object value = rwd.get(key);
                System.out.println(key+":"+value);
            }
        }
    }
}
