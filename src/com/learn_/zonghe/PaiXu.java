package com.learn_.zonghe;

import java.util.Arrays;

public class PaiXu {
    public static void main(String[] args) {
        int[] ints = {2,5,9,101,8,64,6,3,85};
        int temp2=0;
        for(int x=0;x<ints.length-1;x++) {              //外圈循环，循环数组长度-1次，即可完成排序
            for (int i = 0; i < ints.length - 1-x; i++) { //内圈循环，循环数组长度-1次，即可把最大值排最后
                temp2++;
                if (ints[i] > ints[i + 1]) {
                    int temp;
                    temp = ints[i + 1];
                    ints[i + 1] = ints[i];
                    ints[i] = temp;

                }

            }
        }
        System.out.println(Arrays.toString(ints)+temp2);

    }

}
