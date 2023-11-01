package com.vivek.CommandPattern.CommandDesignPatternExample2.receiver;

public class WindowsFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {
        System.out.println("Opening file in WINDOWS OS!!!");
    }

    @Override
    public void writeFile() {
        System.out.println("writing file in WINDOWS OS!!!");
    }

    @Override
    public void closeFile() {
        System.out.println("closing file in WINDOWS OS!!!");
    }
    
}
