package com.IOStream_.ReaderandWriter;

import java.io.*;

/**
 * @author wanghao
 * @version 1.0
 */
public class InStreamToReaderToBuf {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\hjly\\Desktop\\mytemp\\nihao.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path),"GBK");

        BufferedReader bw = new BufferedReader(isr);
        String str = bw.readLine();
        System.out.println(str);
        bw.close();
        isr.close();

    }
}
