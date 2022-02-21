package com.homework_;

/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork10 {
    public static void main(String[] args) {
        Person ts = new Person("唐僧", null);
        ts.common();
        ts.passRiver();
        ts.passRiver();
        ts.common();
    }
}

interface Vehicles{
    void work();
}

class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("正常时候,骑马..");
    }
}

class Boat implements  Vehicles{
    @Override
    public void work() {
        System.out.println("过河时候,坐船..");
    }
}

class VehiclesBean{
    private static final Boat boat = new Boat();
    private static final Horse horse = new Horse();
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return boat;
    }
}
class Person{
    private String name;
    private Vehicles veh;

    public Person(String name, Vehicles veh) {
        this.name = name;
        this.veh = veh;
    }

    public void passRiver(){
        if(!(veh instanceof Boat)){
            veh = VehiclesBean.getBoat();
        }
        veh.work();
    }



    public void common(){
        if(!(veh instanceof Horse)){
            veh = VehiclesBean.getHorse();
        }
        veh.work();
    }
}