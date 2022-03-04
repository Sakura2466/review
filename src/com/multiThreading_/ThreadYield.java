package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
//https://edu.csdn.net/learn/31068/500945?spm=1002.2001.3001.4157
public class ThreadYield {
    public static void main(String[] args) {
        PrintValue printValue = new PrintValue();
        SetValue setValue = new SetValue();
        Thread threadget = new Thread(printValue);
        Thread threadset = new Thread(setValue);
        threadget.start();
        threadset.start();
    }
}
class PrintValue implements Runnable{
    @Override
    public void run() {
        while(SetValue.value==0){
            Thread.yield();
            System.out.println("放弃执行权,等带赋值线程赋值完成");
        }

        System.out.println(SetValue.value);
    }
}
class SetValue implements Runnable{
    public static int value=0;
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value=10;
    }
}
