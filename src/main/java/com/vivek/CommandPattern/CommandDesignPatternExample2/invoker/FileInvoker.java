package com.vivek.CommandPattern.CommandDesignPatternExample2.invoker;

import com.vivek.CommandPattern.CommandDesignPatternExample2.command.Command;

public class FileInvoker {
    public Command command;
    public FileInvoker(Command command){
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }

}
