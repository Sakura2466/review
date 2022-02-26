package com.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wanghao
 * @version 1.0
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList objects = new ArrayList();
        objects.add("Test");
        objects.add(100);
        objects.add(true);
        //迭代器遍历
        Iterator ite = objects.iterator();
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }
        System.out.println("迭代完毕");
        //增强for遍历  迭代器简化版
        for (Object obj :
                objects) {
            System.out.println(obj);
        }

    }
}
