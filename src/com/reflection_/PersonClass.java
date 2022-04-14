package com.reflection_;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wanghao
 * @date 2022/4/14
 */
public class PersonClass {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        //获取person类的Class对象
        Class<Person> personClass = Person.class;
        System.out.println("personClass:"+personClass);
        /**
         * 获取字段
         */
        //通过Class对象获取类的所有字段（Declared不考虑访问修饰符）
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("----------------------");
        //获取变量名为name的字段
        Field name = personClass.getField("name");
        Person person = new Person();
        //获取person实例对象的name字段的值
        Object o = name.get(person);
        System.out.println(o);
        //设置person实例对象的name字段的值
        name.set(person,"zcc");
        System.out.println(person);
        //获取变量名为age的字段（不考虑访问修饰符）
        Field age = personClass.getDeclaredField("age");
        //因为age字段是私有的，所以抑制访问权限检查
        age.setAccessible(true);
        Object o1 = age.get(person);
        System.out.println(o1);
        age.set(person, 19);
        System.out.println(person);
        System.out.println("---------------------");
        /**
         * 获取构造方法
         */
        Constructor<Person> constructor = personClass.getConstructor();
        Person person1 = constructor.newInstance();
        System.out.println("person1:"+person1);
        Person person2 = personClass.newInstance();
        System.out.println("person2:"+person2);
        Constructor<Person> constructor1 = personClass.getConstructor(String.class, int.class);
        Person wgg = constructor1.newInstance("wgg", 25);
        System.out.println("wgg:"+wgg);
        /**
         * 获取方法
         */
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        Person person3 = new Person();
        Method setAge = personClass.getMethod("setAge", int.class);
        setAge.invoke(person3, 18);
        System.out.println("person3:"+person3);
    }
}
