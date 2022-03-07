package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
 class OneTask implements Runnable{
    @Override
    public void run(){
        System.out.println("A");
    }
}

 class TwoTask implements Runnable{
    private Thread thread;
    @Override
    public void run(){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B");
    }
    public void setThread(Thread thread){
        this.thread = thread;
    }
}

 class ThreeTask implements Runnable{
    private Thread thread;
    @Override
    public void run(){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C");
    }
    public void setThread(Thread thread){
        this.thread = thread;
    }
}

public class JoinTest{
    public static void main(String[] args) {
        OneTask one = new OneTask();
        TwoTask two = new TwoTask();
        ThreeTask three = new ThreeTask();
        Thread oneT = new Thread(one);
        Thread twoT = new Thread(two);
        Thread threeT = new Thread(three);
        two.setThread(oneT);
        three.setThread(twoT);
        oneT.start();
        twoT.start();
        threeT.start();
    }
}
