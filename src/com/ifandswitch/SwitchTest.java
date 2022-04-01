package com.ifandswitch;

/**
 * @author wanghao
 * @version 1.0
 */
public class SwitchTest {
    public static void main(String[] args) {
        char today = '一';
        switch (today){
            case '一':
                System.out.println("上班");
                break;
            case '日':
                System.out.println("休息");
                break;
        }
    }
}
