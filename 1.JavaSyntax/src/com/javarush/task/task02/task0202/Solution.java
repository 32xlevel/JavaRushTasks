package com.javarush.task.task02.task0202;

/* 
Откуда берутся Person?
*/
public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Nick";
    }

    public static class Person {
        String name;
        int age;
    }
}
