package com.homework_;

/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork13 {
    public static void main(String[] args) {
        String price = "123514167.59";
        StringBuffer sb = new StringBuffer(price);
        for(int i =sb.lastIndexOf(".")-3;i>0;i-=3){
        sb.insert(i,",");}
        String s = sb.toString();
        System.out.println(s);

    }

}
