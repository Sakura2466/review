package com.collection_;

import java.util.ArrayList;

/**
 * @author wanghao
 * @version 1.0
 */
public class ArrayListTest {
    public static void main(String[] args) {
        /**
        * 底层维护了一个object类型的数组elementData，初始化容量为0
        * 第一次添加时扩容到10    elementData[10]
        * 满了以后再次扩容，扩容容量1.5倍 elementData[15]
        */
        ArrayList arrayList = new ArrayList();

        /**
        * 有参构造器，初始化为指定大小 elementData[6]
        * 满了以后再次扩容，扩容容量1.5倍 elementData[9]
        */
        ArrayList arrayList1 = new ArrayList(5);

    }
}
