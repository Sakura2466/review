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
        int[] arr = new int[5];
        int[] arr1 = new int[]{1,23};
        int[] arr2 = {23,34};
        


    }
}
