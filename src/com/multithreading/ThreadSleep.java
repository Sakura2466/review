package com.multithreading;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author wanghao
 * @version 1.0
 */
public class ThreadSleep {
    public static void main(String[] args) {
        System.out.println(ThreadSleep.getNow());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(ThreadSleep.getNow());
    }
    public static String getNow(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = dateTimeFormatter.format(now);
        return time;
    }
}
