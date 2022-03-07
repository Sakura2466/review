package com.IOStream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author wanghao
 * @version 1.0
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C:\\Users\\77479\\Desktop\\test2.txt");
        int value = 0;
        while((value=in.read())!=-1) {

            System.out.println((char)value);
        }
    }
}
