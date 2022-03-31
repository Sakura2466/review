package com.throwable_;

/**
 * @author wanghao
 * @version 1.0
 */
public class RunntimeException {

        public static void main(String[] args) {
            try {
                process1();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        static void process1() {
            process2();
        }

        static void process2() {
            Integer.parseInt("abc"); // 会抛出NumberFormatException
        }
    }


