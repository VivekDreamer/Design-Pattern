package com.vivek.CommandPattern;

public class Bulb {
    boolean isOn;
    public void turnOnBulb(){
        isOn = true;
        System.out.println("bulb is on");
    }
    public void turnOffBulb(){
        isOn = false;
        System.out.println("bulb is off");
    }
}
