package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

public interface View {
    //update
    void refresh(ModelData modelData);
    //setcontroller
    void setController(Controller controller);
}
