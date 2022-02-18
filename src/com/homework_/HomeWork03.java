package com.homework_;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        /*
        *    int[] arr1={1,2,3,4,5}
        *    int[] arr2={1,2,3,4};  4次
        *
        *
        * */
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {1,2,3,4,5};
        boolean bool=true;
        do {
            System.out.println("是否缩减?? y/n");
            char in=scanner.next().charAt(0);
            if(in=='y'){
                if(arr1.length==1){
                    System.out.println("数组不能继续缩减了："+Arrays.toString(arr1));
                    System.out.println("程序即将退出...");
                    bool=false;
                    break;
                }
                int[] arr2=new int[arr1.length-1];
                for (int i = 0; i <arr1.length-1 ; i++) {
                    arr2[i]=arr1[i];
                }
                arr1=arr2;
                System.out.println(Arrays.toString(arr1));

            }else if(in=='n'){
                System.out.println(Arrays.toString(arr1));
                System.out.println("程序正在退出...");
                bool=false;
            }else{
                System.out.println("输入有误，请重新输入");
                break;
            }

        }while (bool);
        System.out.println("程序已退出");
    }
}
