package com.homework_;

/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork09 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}

class A {
    private String name = "外部测试";

    void show() {
        class B {
            private final String name = "测试";

            public void show() {
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }

}