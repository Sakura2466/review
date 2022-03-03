package com.innerclass_;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.say(new Teacher() {
            @Override
            public void info() {
                System.out.println("测试");
            }
        });
    }
}

interface Teacher{
    void info();
}

class Person{
    public void say(Teacher tea){
        tea.info();
    }
}
