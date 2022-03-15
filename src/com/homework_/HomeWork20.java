package com.homework_;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork20 {
    public static File file;
    public static String path;

    public static void main(String[] args) throws IOException {
        path = "C:\\Users\\hjly\\Desktop\\mytemp";
        file = new File(path);
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("目录创建成功");
            } else {
                System.out.println("目录已存在，创建失败");
            }
        }

        path = path + "\\hello.txt";
        file = new File(path);
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("创建"+path+"成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello,world");
                bufferedWriter.close();
            }else{
                System.out.println("创建"+path+"失败");
            }
        }else {
            System.out.println(path+"文件已经存在");
        }

    }
}
