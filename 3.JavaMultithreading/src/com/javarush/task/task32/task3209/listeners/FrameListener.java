package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Класс-слушатель? Frame - окно
public class FrameListener extends WindowAdapter {
    private View view;

    /*
       Constructor. При создании нового объека FrameListener будет сразу проинициализировано поле view
     */
    public FrameListener(View view) {
        this.view = view;
    }

    /*
       Обработка событий на окне?
     */
    @Override
    public void windowClosing(WindowEvent e) {
        view.exit();
    }
}
