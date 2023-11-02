package com.vivek.CommandPattern.CommandDesignPatternExample2.invoker;

import com.vivek.CommandPattern.CommandDesignPatternExample2.command.CloseFileCommand;
import com.vivek.CommandPattern.CommandDesignPatternExample2.command.OpenFileCommand;
import com.vivek.CommandPattern.CommandDesignPatternExample2.command.WritingFileCommand;
import com.vivek.CommandPattern.CommandDesignPatternExample2.receiver.FileSystemReceiver;

public class FileSystemClient {
    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
        //creating command and associating the file receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        //creating invoker and associating with command.
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        //perform action on invoker object
        fileInvoker.execute();
        
        WritingFileCommand writingFileCommand = new WritingFileCommand(fs);
        fileInvoker = new FileInvoker(writingFileCommand);
        fileInvoker.execute();
        
        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute();
    }
}
