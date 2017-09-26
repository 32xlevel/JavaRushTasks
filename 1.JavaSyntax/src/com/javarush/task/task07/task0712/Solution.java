package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }

        int minLength = 0;
        int minIndex = 0;
        int maxLength = 0;
        int maxIndex = 0;

        ArrayList<String> min = new ArrayList<>();
        ArrayList<String> max = new ArrayList<>();

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).length() < list.get(minIndex).length()) {
                minIndex = i;
                minLength = list.get(i).length();
            }
            if(list.get(i).length() > list.get(maxIndex).length()) {
                maxIndex = i;
                maxLength = list.get(i).length();
            }
        }

        for(int i = 0; i < list.size(); i++) {
            if(minLength == list.get(i).length()) {
                min.add(list.get(i));
            }
        }





        if(minIndex < maxIndex) {
            for(String tmp : min) {
                System.out.println(tmp);
            }
        }

    }
}
