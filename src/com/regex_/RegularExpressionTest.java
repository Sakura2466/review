package com.regex_;

/**
 * @author wanghao
 * @version 1.0
 */
public class RegularExpressionTest {
    public static void main(String[] args) {
        //邮箱校验
        String qqnumber = "1231252@163.com";
        System.out.println(qqnumber.matches("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}"));
        //用匹配正则表达式的内容为分割点分割成字符串数组
        String sjk = "贾乃亮,王宝强,陈羽凡";
        String[] split = sjk.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        //替换正则表达式匹配到的内容
        String sjk2 = "贾乃亮124124王宝强4533陈羽凡";
        String s = sjk2.replaceAll("\\w+", "|");
        System.out.println(s);

    }
}
