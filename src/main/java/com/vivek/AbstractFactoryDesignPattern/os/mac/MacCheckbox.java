package com.vivek.AbstractFactoryDesignPattern.os.mac;

import com.vivek.AbstractFactoryDesignPattern.Checkbox;

public class MacCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Mac checkbox");
    }   
}
