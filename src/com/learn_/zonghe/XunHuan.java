package com.learn_.zonghe;


public class XunHuan {
    public static void main(String[] args) {
        //do while
        int x =1;
        int y=11;
        String[] strs = {"增强","for","循环"};
        String[] strs2= {"增强","for","循环"};
        do{
            System.out.println("do while循环，不论条件是否为真都执行一次");
        }while(x>10);
        //while
        while(y>10){
            System.out.println("只有满足条件才执行");
            y--;
        }
        //for
        for(int i=0;i<3;i++){
            if(i==1){
                continue;//立刻跳转到更新语句i++
            }
            System.out.println("i="+i);
        }
        for(int i=0;i<3;i++){
            if(i==1){
                break;  //立刻跳出循环快
            }
            System.out.println("i="+i);
        }
        //增强for

        for(String str:strs){
            System.out.println(str+",");
        }
        // switch
        switch (x) {
            case 1:
                System.out.println(x);

            case 2:
                System.out.println(x);
                break;

        }

    }
}
