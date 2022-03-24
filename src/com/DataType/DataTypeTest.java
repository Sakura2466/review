package com.DataType;

/**
 * @author wanghao
 * @version 1.0
 */
public class DataTypeTest {
    public static void main(String[] args) {
        /**
         * byte  字节
         * 范围: -128 ， 127   -2^7 ，2^7-1
         * 一个字节=8位   8bit
         * 最大正数 0111 1111  即127
         * 最小负数 1000 0000  即-128
         * +0     0000 0000
         * -0     1000 0000   这个补码对应-128
         */
        byte a = Byte.MAX_VALUE;
        byte b = Byte.MIN_VALUE;
        System.out.println("byte最大值="+a);
        System.out.println("byte最小值="+b);
        /**
         * short 16位 16bit
         * 范围：-32768，32767  -2^15 ,2^15-1
         */
        short c = Short.MAX_VALUE;
        short d = Short.MIN_VALUE;
        System.out.println("short最大值="+c);
        System.out.println("short最小值="+d);
        /**
         * int 32位 32bit
         * 范围：-2147483648 ，2147483647  -2^31 , 2^31-1
         */
        int e = Integer.MAX_VALUE;
        int f = Integer.MIN_VALUE;
        System.out.println("int最大值="+e);
        System.out.println("int最小值="+f);
        /**
         * long 64位 64bit
         * 范围：-9223372036854775808 ，9223372036854775807
         * -2^63 ,2^63-1
         * 默认值：0L
         */
        long g = Long.MAX_VALUE;
        long h = Long.MIN_VALUE;
        System.out.println("long最大值="+g);
        System.out.println("long最小值="+h);
        /**
         * 浮点数：float 32位
         * 默认值：0.0f
         *
         */
        float i=0.0f;
        System.out.println(i);
        /**
         * 浮点数：double 64位
         * 默认值0.0d
         */
        double j = 0.0d;
        System.out.println(j);
        /**
         * boolean 1位
         * true 和 false
         */
        /**
         * char 16位 Unicode字符
         */

        /**
         * 整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。
         *
         * 转换从低级到高级。
         *
         * 低  ------------------------------------>  高
         *
         * byte,short,char—> int —> long—> float —> double
         */
    }
}
