package com.IOStream_.ReaderandWriter;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author wanghao
 * @version 1.0
 */
public class FileReaderTest {
    public static void main(String[] args)  {
        FileReader reader = null;
        int len = 0;
        try{
            reader = new FileReader("C:\\Users\\hjly\\Desktop\\账号.txt");
            while ((len=reader.read())!=-1){
                System.out.print((char)len);
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
