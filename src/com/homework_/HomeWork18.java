package com.homework_;

/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork18 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setName("测试");
        myThread.start();
        Thread.sleep(1000);
        myThread.interrupt();
    }

}
class MyThread extends Thread{
    @Override
    public void run() {
        while(true){
            Thread thread = Thread.currentThread();
            if(thread.isInterrupted()){
                System.out.println(thread.isInterrupted());
                break;
            }
            System.out.println(thread.isInterrupted()+thread.getName());
        }
    }
}
