package com.vivek.CommandPattern.CommandDesignPatternExample2.command;

import com.vivek.CommandPattern.CommandDesignPatternExample2.receiver.FileSystemReceiver;

public class CloseFileCommand implements Command{

    public FileSystemReceiver fileSystemReceiver;
    public CloseFileCommand(FileSystemReceiver fs){
        this.fileSystemReceiver = fs;
    }
    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
    
}
