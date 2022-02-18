package com.homework_;

public class HomeWork02 {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44,55,66};
        for (int i = 0; i <arr1.length/2 ; i++) {
            int temp =arr1[arr1.length-1-i];
            arr1[arr1.length-1-i]=arr1[i];
            arr1[i]=temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
