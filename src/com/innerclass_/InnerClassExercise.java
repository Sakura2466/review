package com.innerclass_;

public class InnerClassExercise {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("手懒猪起床了" );
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
interface Bell{
    void ring();
}

class CellPhone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}