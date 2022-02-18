package com.learn_.poly_.polyparameter;

public class PolyParameter {

    public static void main(String[] args) {
        System.out.println(showEmpAnnual(new Worker("普通员工", 3000)));
        System.out.println(showEmpAnnual(new Manager("经理", 10000, 3000)));
        testWork(new Worker("普通员工", 3000));
        testWork(new Manager("经理", 10000, 3000));

    }

    public static double showEmpAnnual(Employee e){
        return e.getAnnual();
    }

    public static void testWork(Employee e) {
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if (e instanceof Manager){
            ((Manager) e).manage();
        }else if (e instanceof Employee){

        }else{
            System.out.println("类型错误");
        }
    }
}

class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnual() {
        return salary*12;
    }
}

class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void work() {
        System.out.println("普通员工工作");
    }
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理管事");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
}