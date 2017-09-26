package com.javarush.task.task36.task3601;

//Отображение
public class View {
    //Вид
    public void fireEventShowData() {
        System.out.println(new Controller().onDataListShow());
    }
}
