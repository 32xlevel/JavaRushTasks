package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numb = Integer.toString(number);
        char[] chars = numb.toCharArray();
        for(char tmp : chars) {
            int x = (int) tmp;
            if(x%2 == 0)
                even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
