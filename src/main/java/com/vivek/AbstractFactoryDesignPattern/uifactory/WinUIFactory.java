package com.vivek.AbstractFactoryDesignPattern.uifactory;

import com.vivek.AbstractFactoryDesignPattern.Button;
import com.vivek.AbstractFactoryDesignPattern.Checkbox;
import com.vivek.AbstractFactoryDesignPattern.os.window.WinButton;
import com.vivek.AbstractFactoryDesignPattern.os.window.WinCheckbox;

public class WinUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
    
}
