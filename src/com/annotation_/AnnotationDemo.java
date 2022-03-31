package com.annotation_;

/**
 * @author wanghao
 * @version 1.0
 */
@MyAnnotation("annotaion on class")
public class AnnotationDemo{

    @MyAnnotation("annotaion on field")
    public String name;

    @MyAnnotation("annotaion on method")
    public void hello(){}

    @MyAnnotation()
    public void defaultMethod() {

    }
}
