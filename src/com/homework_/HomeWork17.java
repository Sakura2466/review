package com.homework_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork17 {
    public static void main(String[] args) {
        Dao<User> objectDao = new Dao<>();
        objectDao.save("A",new User(17,"王豪"));
        objectDao.save("B",new User(15,"赵晨"));
        System.out.println(objectDao.get("A"));
        System.out.println(objectDao.list());
        objectDao.update("A",new User(25,"王大豪"));
        System.out.println(objectDao.list());
        objectDao.delete("A");
        System.out.println(objectDao.list());
    }
}

class Dao<T>{
    HashMap<String,T> map=new HashMap<>();
    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id, T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        List<T> list=new ArrayList<>();
        for (T value : map.values()) {
            list.add(value);
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
}

class User{
    private int age;
    private String name;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}