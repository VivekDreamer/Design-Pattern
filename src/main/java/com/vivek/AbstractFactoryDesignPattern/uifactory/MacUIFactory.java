package com.vivek.AbstractFactoryDesignPattern.uifactory;

import com.vivek.AbstractFactoryDesignPattern.Button;
import com.vivek.AbstractFactoryDesignPattern.Checkbox;
import com.vivek.AbstractFactoryDesignPattern.os.mac.MacButton;
import com.vivek.AbstractFactoryDesignPattern.os.mac.MacCheckbox;

public class MacUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
    
}
