package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a+b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a-b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a*b;
    }

    public static double division(int a, int b) {
        double res = 0;
        try {
            res = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 невозможно");
        }
        return res;
    }

    public static double percent(int a, int b) {
        return (double)b*100/a;
    }

    public static void main(String[] args) {
        System.out.println(percent(12, 5));
    }
}