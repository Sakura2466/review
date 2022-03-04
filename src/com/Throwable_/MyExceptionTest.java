package com.Throwable_;

/**
 * @author wanghao
 * @version 1.0
 */
public class MyExceptionTest {
    public static void main(String[] args) {
        int x = 0;
        try {
            if(x==0){
                throw new MyException("x不能为0");
            }else if(x<20){
                x++;
            }
        } catch (Exception e) {
            e.printStackTrace();
//            System.exit(-1);
        }
        System.out.println(x);
    }
}
