package com.vivek.AbstractFactoryDesignPattern.os.window;

import com.vivek.AbstractFactoryDesignPattern.Checkbox;

public class WinCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("win checkbox");
    }
    
}