package com.vivek.WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("normal drive strategy");
    }
    
}
