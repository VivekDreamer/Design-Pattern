package com.vivek.AbstractFactoryDesignPattern;

import com.vivek.AbstractFactoryDesignPattern.uifactory.UIFactory;

public class Application {
    private Button button;
    private Checkbox checkBox;
    public Application(UIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckbox();
    }
    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
