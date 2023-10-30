package com.vivek.CommandPattern.CommandDesignPatternExample1.command;

import com.vivek.CommandPattern.CommandDesignPatternExample1.receiver.AirConditioner;

public class TurnACOffCommand implements ICommand{

    AirConditioner ac;
    TurnACOffCommand(AirConditioner _ac){
        this.ac = _ac;
    }
    @Override
    public void execute() {
       ac.turnOffAC();
    }
    
}
