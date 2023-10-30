package com.vivek.CommandPattern.UndoExample.command;

import com.vivek.CommandPattern.UndoExample.receiver.AirConditioner;

public class TurnACOnCommand implements ICommand{

    AirConditioner ac;
    public TurnACOnCommand(AirConditioner _ac){
        this.ac = _ac;
    }
    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
    
}
