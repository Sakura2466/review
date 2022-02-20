package com.homework_;

/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork08 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        double he = cellPhone.sjgn(new Jsq() {
            @Override
            public double jsqgn(double a, double b) {
                return a+b;
            }
        },2,5);
        System.out.println(he);
    }
}

interface Jsq{
    double jsqgn(double a,double b);
}

class CellPhone{
    double sjgn(Jsq jsq,double a,double b){
             return jsq.jsqgn(a,b);

    }
}