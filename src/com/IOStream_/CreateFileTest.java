package com.IOStream_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author wanghao
 * @version 1.0
 */
public class CreateFileTest {
    public static void main(String[] args) {

    }
    @Test
    public void create01(){
        String path="C:\\Users\\77479\\Desktop\\test.txt";
        File file = new File(path);
        try {
            file.createNewFile();
            System.out.println("创建文件成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
