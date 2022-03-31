package com.annotation_;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author wanghao
 * @version 1.0
 */
public class AnnonationTest {
    public static void main(String[] args) throws Exception{

        Class<AnnotationDemo> clazz = AnnotationDemo.class;
        MyAnnotation myAnClass = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(myAnClass.value());

        Field name = clazz.getField("name");
        MyAnnotation myAnField = name.getAnnotation(MyAnnotation.class);
        System.out.println(myAnField.value());

        Method hello = clazz.getMethod("hello", (Class<?>[]) null);
        MyAnnotation myAnMethod = hello.getAnnotation(MyAnnotation.class);
        System.out.println(myAnMethod.value());

        Method defaultMethod = clazz.getMethod("defaultMethod", (Class<?>[]) null);
        MyAnnotation myAnDefault = defaultMethod.getAnnotation(MyAnnotation.class);
        System.out.println(myAnDefault.value());

    }
}
