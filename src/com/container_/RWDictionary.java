package com.container_;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author wanghao
 * @version 1.0
 */
//高并发容器
public class RWDictionary {
    //创建一个HashMap对象存放键值对数据
    private final Map<String,Object> map = new HashMap<>();
    //创建读写锁对象
    private final ReadWriteLock rwl = new ReentrantReadWriteLock(true);
    //获取读锁，调用读写锁方法获取
    private final Lock readLock = rwl.readLock();
    //获取写锁，调用读写锁方法获取
    private final Lock writeLock = rwl.writeLock();

    /**
     * 返回键对应的值
     *
     * @param key 键
     * @return 键对应的值
     */
    public Object get(String key){
        readLock.lock();
        try {
            return map.get(key);
        }finally {
            readLock.unlock();
        }

    }

    /**
     * 返回所有键
     *
     * @return 所有的键
     */
    public String[] getKeys(){
        readLock.lock();
        try {
            return map.keySet().toArray(new String[0]);
        }finally {
            readLock.unlock();
        }
    }

    /**
     * 添加键和值，并返回数据
     *
     * @param key 键
     * @param value 值
     * @return 返回添加的数据
     */
    public Object put(String key,Object value){
        writeLock.lock();
        try {
            return map.put(key, value);
        }finally {
            writeLock.unlock();
        }
    }

    /**
     * 清空容器
     */
    public void clear(){
        writeLock.lock();
        try {
            map.clear();
        }finally {
            writeLock.unlock();
        }
    }
}
