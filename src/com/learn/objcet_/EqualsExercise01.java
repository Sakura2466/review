package com.learn.objcet_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person per1 = new Person("测试", 15, '男');
        Person per2 = new Person("测试", 15, '男');
        Person girl = new Girl("测试", 15, '男');
        System.out.println(per1==per2);
        System.out.println(per1.equals(girl));

    }
}

class Person{
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person per = (Person) obj;
            return this.name==per.name && this.age == per.age && this.gender==((Person) obj).gender;
        }
        return false;
    }
}

class Girl extends Person{
    public Girl(String name, int age, char gender) {
        super(name, age, gender);
    }
}