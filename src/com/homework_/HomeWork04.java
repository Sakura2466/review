package com.homework_;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        String[] strs = {"AA","BB","CC","DD"};
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a = Arrays.binarySearch(strs,input);
        if(a>0){
            for (int i = 0; i <strs.length ; i++) {
            if(input.equals(strs[i])){
                System.out.println(i);
                break;
                }
            }
        }else {
            System.out.println("数组中没有这个元素");
        }
    }
}
