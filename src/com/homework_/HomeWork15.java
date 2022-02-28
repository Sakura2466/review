package com.homework_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork15 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new House("贫民窟",50000.00));
        arrayList.add(new House("别墅",800000.00));
        arrayList.add(new House("乡野小居",250000.00));
        System.out.println(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new House("新数组",250000.00));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        System.out.println(arrayList.addAll(arrayList2));
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.remove(3));
        System.out.println(arrayList);
        Iterator iter = arrayList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().toString());
//            if(iter.hasNext()==false){
//                break;
//            }
        }
        for (Object o : arrayList) {
            System.out.println(o);
        }

    }
}

class House{
    private String name;
    private double price;

    public House(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}