package com.vivek.FactoryDesignPattern.example2.factories;

public class WindowsOperatingSystem extends OperatingSystem{

    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        //command to change directory in windows operating system is different as that of linux.
    }

    @Override
    public void removeDir(String dir) {
        //command to remove directory from windows operating system is different as that of linux.
    }
    
}
