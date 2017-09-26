package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//состояния панели вкладок
public class TabbedPaneChangeListener implements ChangeListener {
    private View view;

    //Constructor
    //При создании нового объекта данного класса поле view будет сразу инициализироваться.
    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }

    //Обработка событий состояния панели вкладок
    @Override
    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();
    }
}
