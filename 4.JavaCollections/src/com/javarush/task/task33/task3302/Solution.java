package com.javarush.task.task33.task3302;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* 
Вторая сериализация в JSON
Требования:
1. Поле name класса Cat должно быть отмечено аннотацией JsonProperty.
2. Поле age класса Cat должно быть отмечено аннотацией JsonIgnore.
3. Поле weight класса Cat должно быть отмечено аннотацией JsonProperty.
4. Значение (value) аннотации JsonProperty у поля name должно быть равно "wildAnimal".
5. Значение (value) аннотации JsonProperty у поля weight должно быть равно "over".
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 3;

        StringWriter writer = new StringWriter();
        convertToJSON(writer, cat);
        System.out.println(writer.toString());

        FileWriter fileWriter = new FileWriter("C:\\Users\\Артур\\Desktop\\Артур\\out.txt");
        convertToJSON(fileWriter, cat);
    }

    public static void convertToJSON(Writer writer, Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, object);
    }

    @JsonAutoDetect
    public static class Cat {
        @JsonProperty(value = "wildAnimal")
        public String name;

        @JsonIgnore
        public int age;

        @JsonProperty(value = "over")
        public int weight;

        Cat() {
        }
    }
}
