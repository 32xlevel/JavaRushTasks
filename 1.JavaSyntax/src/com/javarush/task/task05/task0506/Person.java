package com.javarush.task.task05.task0506;

/* 
Человечки
*/

public class Person {

    String name;
    int age;
    String address;
    char sex;

    public static void main(String[] args) {
        Person person = new Person("Art", 16);
    }

    public Person(String n, int a) {
        name = n;
        age = a;
        System.out.println("Новый человек: " + n + " " + a);
    }
}
