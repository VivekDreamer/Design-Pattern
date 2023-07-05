package com.vivek.AbstractFactoryDesignPattern.os.window;

import com.vivek.AbstractFactoryDesignPattern.Button;

public class WinButton implements Button{

    @Override
    public void paint() {
        System.out.println("win button");
    }
}
