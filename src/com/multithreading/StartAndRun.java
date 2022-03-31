package com.multithreading;

/**
 * @author wanghao
 * @version 1.0
 */
public class StartAndRun {
    /**
     * 方法   位置                  类型  作用      线程数量        调用次数
     * run   thread类实现runnable  非同步 存放任务代码  不产生新线程  无数次
     * start thread                同步  启动线程     产生新线程   1次
     * */
    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        thread01.run();//不产生新线程
        thread01.start();//产生新线程 调用次数1次,再次启动会出问题
    }
}
