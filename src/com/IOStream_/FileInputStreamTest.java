package com.IOStream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author wanghao
 * @version 1.0
 */
public class FileInputStreamTest {
    public static void main(String[] args){
        //1.声明流
        FileInputStream in=null;
        try {
            //2.初始化流
            in = new FileInputStream("C:\\Users\\77479\\Desktop\\test2.txt");
            int b ;
            //3.读取数据
            while ((b=in.read())!=-1){
                System.out.print((char)b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
