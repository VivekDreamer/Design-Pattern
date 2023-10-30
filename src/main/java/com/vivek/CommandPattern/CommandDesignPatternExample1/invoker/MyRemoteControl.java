package com.vivek.CommandPattern.CommandDesignPatternExample1.invoker;

import com.vivek.CommandPattern.CommandDesignPatternExample1.command.ICommand;

public class MyRemoteControl {
    ICommand command;
    MyRemoteControl(){

    }
    public void setCommand(ICommand command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
