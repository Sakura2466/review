package com.YeWu;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author wanghao
 * @version 1.0
 *
 * 需求：获取字符串中每个字符出现的次数
 * 实现：1.用scanner获取用户输入的字符串
 *      2.用for循环遍历字符串中每个字符
 *         char ch = 字符串.charAt(索引值)
 *      3.创建一个hashmap集合，判断map的key是否包含ch
 *          如果包含，把ch对应的value+1
 *          map.put(ch,map.get(key)+1)
 *          如果不包含，把该字符加入集合,key为1,即第一次出现
 *          map.put(ch,1)
 */
public class HowManyOfChar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<Character, Integer> maps = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(maps.containsKey(ch)){
                maps.put(ch,maps.get(ch)+1);
            }else{
                maps.put(ch,1);
            }
        }
        System.out.println(maps);
    }
}
