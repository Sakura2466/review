package com.learn.zonghe;
public class ChuShiHuaShunXu{
    static String a;
    static int b;
    public  ChuShiHuaShunXu()
    {
        System.out.println("构造方法");

    }
    public ChuShiHuaShunXu(String a,int b){
        this();
        this.a=a;
        this.b=b;
        System.out.println("上面是调用无参构造方法");
    }

    {
        System.out.println("构造代码块");
    }
    static{
        System.out.println("静态代码块");
    }

    static void c(){
        System.out.println("静态方法");
    }


    public static void main(String[] args) {
        ChuShiHuaShunXu z = new ChuShiHuaShunXu("测试", 18);
        ChuShiHuaShunXu.c();
        System.out.println(ChuShiHuaShunXu.a + " , " + ChuShiHuaShunXu.b);

    }
}
