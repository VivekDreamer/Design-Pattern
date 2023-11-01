package com.vivek.CommandPattern.CommandDesignPatternExample2.command;

import com.vivek.CommandPattern.CommandDesignPatternExample2.receiver.FileSystemReceiver;

public class WritingFileCommand implements Command{

    public FileSystemReceiver fileSystemReceiver;
    public WritingFileCommand(FileSystemReceiver fs){
        this.fileSystemReceiver = fs;
    }
    @Override
    public void execute() {
       this.fileSystemReceiver.writeFile();
    }
    
}
