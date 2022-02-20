package com.enum_;

/**
 * @author wanghao
 * @version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for (Week week:weeks) {
            System.out.println(week);
        }
    }
}

enum Week{
    MONDEY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDDAY("星期六"),
    SUNDAY("星期日");

    private final String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
