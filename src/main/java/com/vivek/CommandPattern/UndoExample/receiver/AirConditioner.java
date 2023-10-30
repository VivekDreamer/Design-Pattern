package com.vivek.CommandPattern.UndoExample.receiver;

public class AirConditioner {
    boolean isOn;
    int temperature;
    public void turnOnAC(){
        isOn = true;
        System.out.println("AC is ON");
    }
    public void turnOffAC(){
        isOn = false;
        System.out.println("AC is OFF");
    }
    public void setTemperature(int _temp){
        this.temperature = _temp;
        System.out.println("temperature changed to : "+_temp);
    }
}
