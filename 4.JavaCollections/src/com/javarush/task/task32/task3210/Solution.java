package com.javarush.task.task32.task3210;

import java.io.*;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main (String[] args) throws Exception
    {
        String test = "Hi!\n My name is Richard\n I'm a photographer\n";

        //это строчка – ключевая: мы «превратили» строку в Reader
        StringReader reader = new StringReader(test);

        executor(reader);
    }

    public static void executor(Reader reader) throws Exception
    {
        BufferedReader br = new BufferedReader(reader);
        while (br.ready())
        {
            String line = br.readLine();
            System.out.println(line);
        }
    }
}
