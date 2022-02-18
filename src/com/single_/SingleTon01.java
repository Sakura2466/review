package com.single_;

public class SingleTon01 {
    private String name1;
    private static SingleTon01 st= new SingleTon01("唯一对象");
    private SingleTon01(String name){
        this.name1=name;
    };
    public static SingleTon01 getInstance(){
        return st;
    }
}
