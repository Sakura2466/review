package com.homework_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork16 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack",15);
        map.put("tom",22);
        map.put("lucy",52);
        System.out.println(map);
        map.put("jack",20);
        System.out.println(map);
        Set set = map.keySet();
        for (Object key : set) {
            map.put(key,(Integer)map.get(key)+1);
        }
        System.out.println(map);
    }
}
