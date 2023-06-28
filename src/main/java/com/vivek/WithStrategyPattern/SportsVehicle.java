package com.vivek.WithStrategyPattern;
import com.vivek.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SportsDriveStrategy()) ;
    }
    
}
