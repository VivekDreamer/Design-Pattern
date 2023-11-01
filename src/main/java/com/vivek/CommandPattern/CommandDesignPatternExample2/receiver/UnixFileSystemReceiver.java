package com.vivek.CommandPattern.CommandDesignPatternExample2.receiver;

public class UnixFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {
        System.out.println("Opening file in UNIX OS!!!");
    }

    @Override
    public void writeFile() {
        System.out.println("writing file in UNIX OS!!!");
    }

    @Override
    public void closeFile() {
        System.out.println("closing file in UNIX OS");
    }
    
}
