package com.vivek.CommandPattern.UndoExample.command;

import com.vivek.CommandPattern.UndoExample.receiver.AirConditioner;

public class TurnACOffCommand implements ICommand{

    AirConditioner ac;
    public TurnACOffCommand(AirConditioner _ac){
        this.ac = _ac;
    }
    @Override
    public void execute() {
       ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
    
}
