package com.iostream_.ReaderandWriter;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author wanghao
 * @version 1.0
 */
public class FileReaderCharTest {
    public static void main(String[] args)  {
        FileReader reader = null;
        int len = 0;
        char[] chars = new char[10];
        try{
            reader = new FileReader("C:\\Users\\hjly\\Desktop\\账号.txt");
            while ((len=reader.read(chars))!=-1){
                System.out.print(new String(chars,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
