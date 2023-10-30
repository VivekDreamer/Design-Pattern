package com.vivek.CommandPattern.UndoExample.invoker;

import java.util.Date;

import com.vivek.CommandPattern.UndoExample.command.TurnACOnCommand;
import com.vivek.CommandPattern.UndoExample.receiver.AirConditioner;

public class Client {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl remoteControl = new MyRemoteControl();
        //create the command and press button
        remoteControl.setCommand(new TurnACOnCommand(airConditioner));
        remoteControl.pressButton();
        //undo the last operation
        remoteControl.undo();
        Date currentDate = new Date();
        System.out.println(currentDate.getTime());
        long fiveDaysInMillis = 5 * 24 * 60 * 60 * 1000L; // 5 days in milliseconds
        Date dateAfter5Days = new Date(currentDate.getTime() + fiveDaysInMillis);  
        System.out.println(dateAfter5Days.getTime()); 
    }
}
