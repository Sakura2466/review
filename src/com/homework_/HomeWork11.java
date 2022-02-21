package com.homework_;

/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork11 {
    public static void main(String[] args) {
        Car car = new Car(22);
        car.getAir().flow();
    }
}

class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
    class Air{
        void flow() {
            double tem = getTemperature();
            if (tem > 40) {
                System.out.println("正在吹冷气");
            } else if (tem < 0) {
                System.out.println("正在吹热气");
            } else {
                System.out.println("空调关闭");
            }
        }
    }

    public Air getAir(){
        return new Air();
    }
}


