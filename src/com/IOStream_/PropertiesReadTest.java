package com.IOStream_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author wanghao
 * @version 1.0
 */
public class PropertiesReadTest {
    public static void main(String[] args) throws IOException {
        //创建配置文件操作对象
        Properties properties = new Properties();
        //调用load方法，传入IO对象把配置文件加载进来
        properties.load(new FileReader(
                "C:\\Users\\hjly\\Desktop\\prop.properties"));
        //将此属性列表打印到指定的输出流。比如控制台
        properties.list(System.out);
        //获取指定属性的值。比如user的值
        String user = properties.getProperty("user");
        System.out.println("user="+user);


    }
}
