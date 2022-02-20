package com.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Tea.HotTea ht = new Tea().getInstance();
        ht.info();

    }
}

class Tea{
    private int a=100;
    public class HotTea{
        private int a=200;
        void info(){
            System.out.println("内部类a="+a+"外部类a="+Tea.this.a);
        }
    }
     HotTea getInstance(){
        return new HotTea();
    }
}
