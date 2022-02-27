package com.collection_;

/**
 * @author wanghao
 * @version 1.0
 */
public class LinkedListTest {
    public static void main(String[] args) {
        Node<Person> n1 = new Node<>(new Person("A",15));
        Node<Person> n2 = new Node<>(new Person("B",15));
        Node<Person> n3 = new Node<>(new Person("C",15));
        n1.next=n2;
        n2.next=n3;
        n3.prev=n2;
        n2.prev=n1;
        Node first =n1;
        Node last = n3;
        Node[] nodes = new Node[10];
        nodes[1]=first;
        for (int i = 0; i < nodes.length; i++) {
            Node node = nodes[i];
            if(node!=null){
                while (true){
                    if (first.next==null){
                        break;
                    }
                    System.out.println(first.toString());
                    first = first.next;
                }
            }
            System.out.println(node);

        }


    }
    private static class Node<T>{
        T item;
        Node<T> next;
        Node<T> prev;

        public Node(T item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item.toString() +
                    '}';
        }
    }
}


class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}