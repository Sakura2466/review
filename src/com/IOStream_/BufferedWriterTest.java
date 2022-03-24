package com.IOStream_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wanghao
 * @version 1.0
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\hjly\\Desktop\\mytemp\\hello1.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));
        bw.write("helloworld333333");
        bw.newLine();
        bw.write("helloworld444444");
        bw.flush();
        bw.close();
    }
}
