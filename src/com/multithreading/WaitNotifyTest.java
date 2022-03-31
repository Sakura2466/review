package com.multithreading;

/**
 * @author wanghao
 * @version 1.0
 */
public class WaitNotifyTest{
    public static void main(String[] args) {
        DataClass dataClass = new DataClass();
        ShengChan shengChan = new ShengChan(dataClass);
        Xiaofei xiaofei = new Xiaofei(dataClass);
        Thread thread = new Thread(shengChan);
        Thread thread1 = new Thread(xiaofei);
        thread.start();
        thread1.start();
    }
}

 class DataClass {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

class ShengChan implements Runnable{
    private final DataClass dc;

    public ShengChan(DataClass dc) {
        this.dc = dc;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            synchronized (dc){
                if (dc.getMessage()==null){
                    dc.setMessage(++i +"号物品");
                    System.out.println("生产"+dc.getMessage());
                }
                dc.notify();
                try {
                    dc.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}

class Xiaofei implements Runnable{
    private final DataClass dc;

    public Xiaofei(DataClass dc) {
        this.dc = dc;
    }

    @Override
    public void run() {
        while (true){
            synchronized (dc){
                if (dc.getMessage()!=null){
                    System.out.println("消费"+dc.getMessage());
                    dc.setMessage(null);
                }
                dc.notify();
                try {
                    dc.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
