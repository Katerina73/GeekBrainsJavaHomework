package com.company;

public class Main {

    public static void main(String[] args) {

        //Exercise 1
        System.out.println("Hello, world!");

        //Exercise 2
        byte by = 127;
        short sh = 32767;
        int in = 2147483647;
        long lo = 9223372036854775807L;
        float fl = 13.47f;
        double db = 1478.346;
        char ch = '_';
        boolean bo = true;
        String st = "Привет!";

        System.out.println(Exercise3(7.56f, 11.4f, 426f, 2f));
        System.out.println(Exercise4(3, 7));
        Exercise5(0);
        System.out.println(Exercise6(0));
        Exercise7("GeekBrains");
        Exercise8(1300);
    };

    //Exercise 3
    public static float Exercise3(float a, float b, float c, float d) {
        return a*(b+(c/d));
    };

    //Exercise 4
    public static boolean Exercise4(int e, int f) {
        if (((e + f) >= 10) && ((e + f) <= 20)) {
            return true;
        } else {
            return false;
        }
    };

    //Exercise 5
    public static void Exercise5(int g) {
        if (g >= 0) {
            System.out.println("Это положительное число.");
        } else {
            System.out.println("Это отрицательное число.");
        }
    };

    //Exercise 6
    public static boolean Exercise6(int h) {
        if (h < 0) {
            return true;
        }
        return false;
    };

    //Exercise 7
    public static void Exercise7(String name) {
        System.out.println("Привет, " + name + "!");
    };

    //Exercise 8
    public static void Exercise8(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) ^ (year % 400 == 0)) {
            System.out.println("Это високосный год.");
        }
        else {
            System.out.println("Это не високосный год.");
        }
    };
}

