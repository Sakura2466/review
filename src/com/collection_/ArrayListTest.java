package com.collection_;

import java.util.ArrayList;

/**
 * @author wanghao
 * @version 1.0
 */
public class ArrayListTest {
    public static void main(String[] args) {
        /*
        * 无参构造器，初始化容量为0，第一次add时，扩容到10
        * 满了以后再次扩容，扩容容量1.5倍
        * */
        ArrayList arrayList = new ArrayList();
        /*
        * 有参构造器，初始化为指定大小
        * 满了以后再次扩容，扩容容量1.5倍
        * */
        ArrayList arrayList1 = new ArrayList(5);
        //不安全，效率高
    }
}
