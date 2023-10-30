package com.vivek.CommandPattern.UndoExample.invoker;

import java.util.Stack;

import com.vivek.CommandPattern.UndoExample.command.ICommand;

public class MyRemoteControl {
    Stack<ICommand> acCommandHistory = new Stack<>();
    ICommand command;
    MyRemoteControl(){}
    public void setCommand(ICommand command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
        acCommandHistory.add(command);
    }
    public void undo(){
        if(!acCommandHistory.isEmpty()){
            ICommand lastCommand = acCommandHistory.pop();
            lastCommand.undo();
        }
    }
}
