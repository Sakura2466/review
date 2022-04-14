package com.reflection_;

import java.lang.reflect.Field;

/**
 * @author wanghao
 * @version 1.0
 */
public class ReflectionTest {
    public static void main(String[] args) throws Exception {
        Person person = new Person("wh",25);
        Class<? extends Person> personClass = person.getClass();
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object o = declaredField.get(person);
            System.out.println("field= "+declaredField.getName()+" "+"value= "+o);
        }


    }
}
