package com.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wanghao
 * @version 1.0
 */
public class ArrayListBianLi {
    public static void main(String[] args) {
        /**
         * ArrayList四种遍历方式
         */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("黑盒");
        arrayList.add("啊啊");
        arrayList.add("测试一下");
        /**
         *  for循环遍历
         */
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
        /**
         * 增强for循环遍历
         */
        for (String str:arrayList) {
            System.out.println(str);
        }
        /**
         * 迭代器遍历
         */
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /**
         * lambda表达式遍历
         */
        arrayList.forEach(s -> System.out.println(s));
        arrayList.forEach(System.out::println);
    }
}
