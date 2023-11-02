package com.vivek.CommandPattern.CommandDesignPatternExample2.invoker;

import com.vivek.CommandPattern.CommandDesignPatternExample2.receiver.FileSystemReceiver;
import com.vivek.CommandPattern.CommandDesignPatternExample2.receiver.UnixFileSystemReceiver;
import com.vivek.CommandPattern.CommandDesignPatternExample2.receiver.WindowsFileSystemReceiver;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem(){
        String osname = System.getProperty("os.name");
        System.out.println("Underlying OS is : "+osname);
        if(osname.contains("Windows")){
            return new WindowsFileSystemReceiver();
        }
        else{
            return new UnixFileSystemReceiver();
        }
    }
}
