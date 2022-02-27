package com.collection_;

import java.util.Vector;

/**
 * @author wanghao
 * @version 1.0
 */
public class VectorTest {
    public static void main(String[] args) {
        /*
        * 无参构造器，初始化容量为10
        * 满了以后，扩容容量2倍
        * */
        Vector vector = new Vector();
        /*
        * 有参构造器，初始化为指定大小
        * 满了以后，扩容容量2倍
        * */
        Vector vector1 = new Vector(5);
    }
}
