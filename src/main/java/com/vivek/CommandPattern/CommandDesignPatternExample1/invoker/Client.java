package com.vivek.CommandPattern.CommandDesignPatternExample1.invoker;

import com.vivek.CommandPattern.CommandDesignPatternExample1.command.TurnACOnCommand;
import com.vivek.CommandPattern.CommandDesignPatternExample1.receiver.AirConditioner;

public class Client {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl remoteControl = new MyRemoteControl();
        //create the command and press button
        remoteControl.setCommand(new TurnACOnCommand(airConditioner));
        remoteControl.pressButton();
    }
}
