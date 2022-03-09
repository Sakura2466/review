package com.IOStream_;

import java.io.*;

/**
 * @author wanghao
 * @version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {
        File oldfile = new File("C:\\Users\\77479\\Desktop\\zcc.jpg");
        File newfile = new File("C:\\Users\\77479\\Desktop\\zcc1.jpg");
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(oldfile);
            out = new FileOutputStream(newfile);
            int len;
            byte[] bytes = new byte[1024];
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in!=null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out!=null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
