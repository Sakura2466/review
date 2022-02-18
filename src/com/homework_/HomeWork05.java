package com.homework_;

public class HomeWork05 {
    public static void main(String[] args) {
        /*
        *    二维数组输出：
        *     1
        *     2 2
        *     3 3 3
        *     。。。。
        * */
        int[][] arrs=new int[10][];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i]= new int[i+1];

            for (int j = 0; j <arrs[i].length ; j++) {
                arrs[i][j]=i+1;
                System.out.print(arrs[i][j]+" ");
            }
            System.out.println();

        }

    }
}
