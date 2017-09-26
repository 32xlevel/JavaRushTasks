package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane(); //компонент панели с 2 вкладками
    private JTextPane htmlTextPane = new JTextPane(); //компонент для визуального редактирования html (на 1 вкладке)
    private JEditorPane plainTextPane = new JEditorPane(); //компонент для редактирования html в виде текста,
                                                           // он будет отображать код html (теги и их содержимое)

    //Getter of controller
    public Controller getController() {
        return controller;
    }

    //Setter for controller
    public void setController(Controller controller) {
        this.controller = controller;
    }

    //Обработка событий
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //Метод, отвечающий за инициализацию представления
    public void init() {
        initGui();
        FrameListener listener = new FrameListener(this);
        addWindowListener(listener); //Регистрация слушателя. WindowAdapter - слушатель
        setVisible(true);
    }

    //Method EXIT
    public void exit() {
        controller.exit();
    }

    //Метод инициализации меню
    public void initMenuBar() {

    }

    //Метод инициализации панелей редактора
    public void initEditor() {
        htmlTextPane.setContentType("text/html");
        JScrollPane jScrollPane = new JScrollPane(htmlTextPane);

    }

    //Метод инициализации графического интерфейса
    //метод pack() устанавливает такой минимальный размер контейнера, который достаточен для отображения всех компонентов
    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

    public void selectedTabChanged() {

    }

}
