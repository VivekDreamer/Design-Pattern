package com.vivek.CommandPattern;

public class AirConditioner {
    boolean isOn;
    int temperature;
    public void turnOnAc(){
        isOn = true;
        System.out.println("AC is on");
    }
    public void turnOffAc(){
        isOn = false;
        System.out.println("AC is off");
    }
    public void setTemperature(int temp){
        this.temperature = temp;
        System.out.println("Temperature changed to : "+temperature);
    }
}
