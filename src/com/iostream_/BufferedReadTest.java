package com.iostream_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wanghao
 * @version 1.0
 */
public class BufferedReadTest {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\hjly\\Desktop\\mytemp\\hello.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String str = "";
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }
        if(br!=null){
            br.close();
        }

    }
}
