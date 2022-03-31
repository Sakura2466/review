package com.iostream_.ReaderandWriter;

import java.io.*;
import java.util.Properties;

/**
 * @author wanghao
 * @version 1.0
 */
public class SerializableTest {
    public static void main(String[] args) throws IOException {
        //创建文件路径
        String path = "C:\\Users\\hjly\\Desktop\\mytemp\\dog.properties";
        //创建Properties对象
        Properties properties = new Properties();
        //创建字符输出流
        FileWriter fileWriter = new FileWriter(path);
        //给properties对象添加键值属性
        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("color", "red");
        //把properties对象写入字符输出流
        properties.store(fileWriter, null);
        fileWriter.close();
        System.out.println(properties);
        String name = properties.getProperty("name");
        System.out.println(name);
        int age = Integer.parseInt(properties.get("age")+"");
        String color = properties.get("color")+"";
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);
        String serPath = "C:\\Users\\hjly\\Desktop\\mytemp\\dog.dat";
        //创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serPath));
        oos.writeObject(dog);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serPath));
        try {
            Dog dog1 = (Dog)ois.readObject();
            System.out.println(dog1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            ois.close();
        }


    }
}
class Dog implements Serializable{
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
