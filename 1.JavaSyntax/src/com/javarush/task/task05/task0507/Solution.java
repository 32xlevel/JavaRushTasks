package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int sum = 0;
        double res = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if(number == -1) break;
            count = count + 1;
            sum = sum + number;
        }
        res = (sum+1)/count;
        System.out.println(res);
    }
}

