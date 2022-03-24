package com.YunSuanFu;

/**
 * @author wanghao
 * @version 1.0
 */
public class Operator {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        /**
         * 算术运算符 ：+  -  *  /  %  ++  --
         */
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(++a);
        System.out.println(--b);
        /**
         * 关系运算符：<  ==  >  !=  <=  >=
         */
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        /**
         * 位运算符：&  |  ~  ^  >>  <<  >>>
         */
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~b);
        System.out.println(a^b);
        System.out.println(a>>2);
        System.out.println(b<<2);
        System.out.println(a>>>3);
        /**
         * 逻辑运算符：&&  ||  !
         */
        System.out.println(a>b&&b<a);
        System.out.println(a<b||b>a);
        System.out.println(!(a<b));
        /**
         * 赋值运算符：=  +=  -=  *=  /=  （%）=
         *          <<= >>=  &=   |=  ^=
         */


        /**
         * 条件运算符（三元运算符）：int a = b ? if true : if false
         */
        System.out.println(a==b ? a : b);
        System.out.println(b);
        /**
         * instanceof : A instanceof B   判断A是否是B类型或者B类型子类
         *
         */



    }
}
