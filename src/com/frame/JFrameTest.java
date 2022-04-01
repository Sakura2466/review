package com.frame;

import javax.swing.*;

/**
 * @author wanghao
 * @version 1.0
 */
public class JFrameTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300,300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
