package com.javarush.task.task32.task3209;

import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Controller {
    private View view;
    private HTMLDocument document;
    private File currentFile;

    //Конструктор. При создании нового объекта контроллера поле view будет сразу инициализировано
    public Controller(View view) {
        this.view = view;
    }

    public static void main(String[] args) throws Exception {
        View view = new View();
        Controller controller = new Controller(view);
        view.setController(controller);

        view.init();
        controller.init();
    }

    //Метод, отвечающий за инициализацию
    public void init() {

    }

    //Method EXIT
    public void exit() {
        System.exit(0);
    }
}
