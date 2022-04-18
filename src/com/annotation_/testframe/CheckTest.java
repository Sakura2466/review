package com.annotation_.testframe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author wanghao
 * @date 2022/4/18
 */
public class CheckTest {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        Class<? extends Calculator> aClass = calculator.getClass();
        Method[] methods = aClass.getMethods();
        int number = 0 ;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(calculator);
                }catch (Exception e){
                    number++;
                    bufferedWriter.write(method.getName()+"方法出现异常");
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常的名称："+e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常的原因："+e.getCause().getMessage());
                    bufferedWriter.newLine();
                    bufferedWriter.write("-----------------------------");
                    bufferedWriter.newLine();
                }
            }
        }
        if (number > 0) {
            bufferedWriter.write("本次测试一共出现"+number+"个异常");
        } else {
            bufferedWriter.write("恭喜您，本次测试没有出现异常");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
