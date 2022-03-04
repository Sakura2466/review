package com.multiThreading_;

import java.util.concurrent.Callable;

/**
 * @author wanghao
 * @version 1.0
 */
public class ImplCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "返回值:线程01启动";
    }
}
