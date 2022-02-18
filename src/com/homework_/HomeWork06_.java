package com.homework_;

public class HomeWork06_ {
    public static void main(String[] args) {
        /*
        * 杨辉三角
        * 1
        * 1 1
        * 1 2 1
        * 1 3 3 1
        * 1 4 6 4 1
        * 1 5 10 10 5 1
        *
        * */
        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i]=new int[i+1];
            for (int j = 0; j <yanghui[i].length ; j++) {
                if(j==0||j==yanghui[i].length-1){
                    yanghui[i][j]=1;
                }else{
                    yanghui[i][j]=yanghui[i-1][j]+yanghui[i-1][j-1];
                }
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }
    }
}
