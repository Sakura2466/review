package com.iostream_.ReaderandWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wanghao
 * @version 1.0
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter= new FileWriter("C:\\Users\\hjly\\Desktop\\test.txt");
            fileWriter.write("风雨过后,才能见彩虹");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("执行完毕");

    }
}
