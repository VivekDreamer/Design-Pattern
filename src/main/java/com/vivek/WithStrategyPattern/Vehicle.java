package com.vivek.WithStrategyPattern;

import com.vivek.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
     DriveStrategy driveObject;

     //this is known as constructor injection
    public Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }
    public void drive(){
        driveObject.drive();
    }
}
