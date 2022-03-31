package com.multithreading;

/**
 * @author wanghao
 * @version 1.0
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        TicketSale ticketSale = TicketSale.getTicketSale();
        Thread thread1 = new Thread(ticketSale,"线程01");
        Thread thread2 = new Thread(ticketSale,"线程02");
        Thread thread3 = new Thread(ticketSale,"线程03");
        thread1.start();

        thread2.start();

        thread3.start();

    }
}

 class TicketSale implements Runnable {
    private int quantity=10;
    private volatile static TicketSale ticketSale;
    private TicketSale(){};
    @Override
    public  void run() {
        while(quantity>0){
            saleTicket();
        }
    }

     public static TicketSale getTicketSale() {
        if(ticketSale==null){

            synchronized (TicketSale.class) {
                if(ticketSale==null) {
                    ticketSale = new TicketSale();
                }
            }
        }
        return ticketSale;
}

     private synchronized void saleTicket() {
        if(quantity>0) {
            System.out.println("当前正在执行的线程为" + Thread.currentThread());
            System.out.println(quantity + "号票");
            quantity--;
        }
    }
}
