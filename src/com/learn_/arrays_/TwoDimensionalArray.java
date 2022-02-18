package com.learn_.arrays_;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arrs1= {{0,0,0,0,0,0},
                        {0,0,1,0,0,0},
                        {0,2,0,3,0,0},
                        {0,0,0,0,0,0}};

        for (int[] arrs2:arrs1) {
            for (int a:arrs2) {
                System.out.print(a+" ");

            }
            System.out.println();
        }

    }
}
