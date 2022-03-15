package com.IOStream_;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author wanghao
 * @version 1.0
 */
public class PropertiesWriteTest {
    public static void main(String[] args) throws IOException {
        //创建配置文件操作对象
        Properties properties = new Properties();
        properties.setProperty("tel", "17797753078");
        properties.setProperty("name", "wh");
        FileWriter fileWriter = new FileWriter("C:\\Users\\hjly\\Desktop\\msg.properties");
        properties.store(fileWriter, null);
        properties.setProperty("name", "zcc");
        properties.store(fileWriter, "name update");

    }
}
