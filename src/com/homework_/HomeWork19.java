package com.homework_;

/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork19 {
    public static void main(String[] args) {
        Card card = new Card();
        Thread thread = new Thread(card);
        Thread thread1 = new Thread(card);
        thread.start();
        thread1.start();

    }
}
class Card implements Runnable{


    public void setMoney() {
        this.money-=1000;
        System.out.println("取出1000元");
    }

    private double money=8965;



    @Override
    public void run() {
        while(true) {
            synchronized (this) {
                if(money<1000) {
                    System.out.println("余额不足："+money);
                    break;
                }
                money-=1000;
                System.out.println(Thread.currentThread().getName()+"取出1000，余额："+money);
            }
        }
    }
}
