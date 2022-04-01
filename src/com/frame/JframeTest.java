package com.frame;

/**
 * @author wanghao
 * @version 1.0
 */
public class JframeTest {
    public static final int INT = 1000000000;


    public static void main(String[] args){
        Long num = 9898989881231123L;
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println("它是个"+count+"位的数！");
        byte a = 2;
        short b = 3;
        char c = 'a';
        System.out.println(a+b+c);
        System.out.println((char)197);
    }
}
