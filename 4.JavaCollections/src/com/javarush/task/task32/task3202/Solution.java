package com.javarush.task.task32.task3202;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

/* 
Читаем из потока
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("C:\\Users\\Артур\\Desktop\\Артур\\out.txt"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        byte[] bytes = new byte[is.available()];
        while(is.available() > 0) {
            is.read(bytes);
        }

        StringWriter stringWriter = new StringWriter();
        stringWriter.write(new String(bytes));

        return stringWriter;
    }
}