package com.multithreading;

/**
 * @author wanghao
 * @version 1.0
 */
public class DaemonThread {
    public static void main(String[] args) {
        DaemonTask daemonTask = new DaemonTask();
        Thread thread = new Thread(daemonTask);
        System.out.println(thread.isDaemon());
        thread.setDaemon(true);
        System.out.println(thread.isDaemon());
//        thread.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}

class DaemonTask implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("正在执行");
        }

    }
}
