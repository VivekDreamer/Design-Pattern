package com.vivek.CommandPattern.CommandDesignPatternExample2.command;

import com.vivek.CommandPattern.CommandDesignPatternExample2.receiver.FileSystemReceiver;

public class OpenFileCommand implements Command{

    private FileSystemReceiver fileSystemReceiver;
    public OpenFileCommand(FileSystemReceiver fs){
        this.fileSystemReceiver = fs;
    }
    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystemReceiver.openFile();
    }
    
}
