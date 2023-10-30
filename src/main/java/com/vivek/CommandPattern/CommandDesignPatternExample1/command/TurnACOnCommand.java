package com.vivek.CommandPattern.CommandDesignPatternExample1.command;

import com.vivek.CommandPattern.CommandDesignPatternExample1.receiver.AirConditioner;

public class TurnACOnCommand implements ICommand{

    AirConditioner ac;
    public TurnACOnCommand(AirConditioner _ac){
        this.ac = _ac;
    }
    @Override
    public void execute() {
        ac.turnOnAC();
    }
    
}
