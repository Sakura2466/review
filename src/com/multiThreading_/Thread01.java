package com.multiThreading_;

/**
 * @author wanghao
 * @version 1.0
 */
public class Thread01 extends Thread {
    public String getThread01name() {
        return thread01name;
    }

    public void setThread01name(String thread01name) {
        this.thread01name = thread01name;
    }

    private String thread01name;

    @Override
    public void run() {
        System.out.println(thread01name+"启动");
    }
}
