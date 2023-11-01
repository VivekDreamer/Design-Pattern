package com.vivek.CommandPattern.CommandDesignPatternExample2.receiver;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
