package com.vivek.AbstractFactoryDesignPattern.os.mac;

import com.vivek.AbstractFactoryDesignPattern.Button;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Mac button");
    }
    
}
