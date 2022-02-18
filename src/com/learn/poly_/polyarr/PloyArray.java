package com.learn.poly_.polyarr;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("ren", 32);
        persons[1] = new Student("xuesheng1", 15, 100);
        persons[2] = new Student("xuesheng2", 16, 99);
        persons[3] = new Teacher("laoshi1", 33, 2000);
        persons[4] = new Teacher("laoshi2", 35, 3000);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {
                ((Student) persons[i]).study();
            } else if(persons[i] instanceof  Teacher){
                ((Teacher) persons[i]).teach();
            } else if(persons[i] instanceof  Person){

            } else {
                System.out.println("类型错误");
            }
        }
    }
}

class Person {
    private String name;
    private int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say() {
        return name + "\t" + age;
    }
}

class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say()+"score="+score;
    }

    public void study() {
        System.out.println("学生学习");
    }
}

class Teacher extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say()+"salary="+salary;
    }

    public void teach() {
        System.out.println("老师教课");
    }
}