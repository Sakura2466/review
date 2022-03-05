package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
public class ThreadJoin {
    public static void main(String[] args) {
        OnePrint onePrint = new OnePrint();
        TwoPrint twoPrint = new TwoPrint();
        ThreePrint threePrint = new ThreePrint();
        Thread oneThread = new Thread(onePrint);
        Thread twoThread = new Thread(twoPrint);
        Thread threeThread = new Thread(threePrint);
        twoPrint.setThread(oneThread);
        threePrint.setThread(twoThread);
        oneThread.start();
        twoThread.start();
        threeThread.start();

    }
}

class OnePrint implements Runnable{
    @Override
    public void run() {
        System.out.println(1);
    }
}

class TwoPrint implements Runnable{
    private Thread thread;
    @Override
    public void run() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(2);
    }
    public void setThread(Thread thread){
        this.thread=thread;
    }
}

class ThreePrint implements Runnable{
    private Thread thread;
    @Override
    public void run() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(3);
    }
    public void setThread(Thread thread){
        this.thread=thread;
    }
}

