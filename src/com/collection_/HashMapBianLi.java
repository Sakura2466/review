package com.collection_;

import java.util.*;

/**
 * @author wanghao
 * @version 1.0
 */
public class HashMapBianLi {
    public static void main(String[] args) {
        HashMap<String,Integer> maps = new HashMap<>();
        maps.put("黑盒", 1);
        maps.put("测试", 2);
        maps.put("哦哦", 3);
        /**
         * 第一种,先取出所有key,调用map集合的keySet()方法获取所有key
         * 放到set集合中。
         */
        Set<String> strings = maps.keySet();
        //增强for遍历所有key
        for (String string : strings) {
            System.out.println(string+":"+maps.get(string));
        }
        //迭代器遍历所有key
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String key =  iterator.next();
            System.out.println(key+"-"+maps.get(key));
        }

        /**
         * 第二种，只能取出所有value，调用map集合的values()方法取出所有value
         * 放到collection集合中。
         */
        Collection<Integer> values = maps.values();
        //增强for循环遍历
        for (Integer value : values) {
            System.out.println(value);
        }
        //迭代器遍历
        Iterator<Integer> iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Integer value =  iterator1.next();
            System.out.println(value);
        }

        /**
         * 第三种，调用map集合的entrySet方法获取键值对
         */
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        //增强for遍历
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"|"+entry.getValue());
        }
        //迭代器遍历
        Iterator<Map.Entry<String, Integer>> iterator2 = entries.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> next = iterator2.next();
            System.out.println(next.getKey()+"|"+next.getValue());
        }
    }
}
