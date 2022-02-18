package com.learn.zonghe;

public class MeiJu {
    Color color = Color.BLUE;

    enum Color {
        BLUE, YELLOW, RED

    }


    void bijiao() {
        if (color == Color.BLUE) {
            System.out.println("枚举蓝色匹配成功");
        }
    }

    public static void main(String[] args) {
        MeiJu meiju = new MeiJu();
        meiju.bijiao();
        MeiJu meiJu = new MeiJu();
    }
}
