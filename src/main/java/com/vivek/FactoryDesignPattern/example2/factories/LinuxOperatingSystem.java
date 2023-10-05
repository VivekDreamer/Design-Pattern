package com.vivek.FactoryDesignPattern.example2.factories;

public class LinuxOperatingSystem extends OperatingSystem{

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        //command to change directory in linux operating system is different as that of windows.
    }

    @Override
    public void removeDir(String dir) {
        //command to remove directory from linux operating system is different as that of windows.
    }
    
}
