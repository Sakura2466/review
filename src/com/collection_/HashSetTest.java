package com.collection_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author wanghao
 * @version 1.0
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add("测试");
        hashSet.add(new Integer(15));
        hashSet.add(true);
        hashSet.add('A');
        hashSet.add(0.05d);
        System.out.println("hashset="+hashSet);

    }
}
