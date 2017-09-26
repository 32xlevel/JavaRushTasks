package com.javarush.task.task07.task0706;

import java.util.Arrays;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int mass[] = new int[15]; //Индекс - номер дома  Значение - число жителей
        for(int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }

        int count2 = 0;
        int count3 = 0;

        for(int i = 0; i < mass.length; i++) {
            if(i%2 == 0) count2 = count2 + mass[i];
            else count3 = count3 + mass[i];
        }

        if(count2 < count3) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}
