package com.homework_;

/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork12 {
    public static void main(String[] args) {
        Color blue = Color.BLUE;
        switch (blue){
            case RED:
            case BLUE:
                System.out.println("匹配蓝色成功");
                blue.show();
                break;

        }
    }
}
interface ColorShow{
    void show();
}
enum Color implements ColorShow {

    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValie;

    Color(int redValue, int greenValue, int blueValie) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValie = blueValie;
    }


    @Override
    public void show() {
        System.out.println(redValue+","+greenValue+","+blueValie);
    }
}
