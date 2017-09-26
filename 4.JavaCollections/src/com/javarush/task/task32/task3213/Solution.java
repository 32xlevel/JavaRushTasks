package com.javarush.task.task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor Dpljr");
        System.out.println(decode(reader, -3));  //Hello Amigo
    }

    public static String decode(StringReader reader, int key) throws IOException {
        if(reader == null) return "null";
        BufferedReader bf = new BufferedReader(reader);
        String text = bf.readLine();
        char[] chars = text.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            chars[i] += key;
        }

        text = new String(chars);
        bf.close();
        return text;
    }

}
