package com.vivek.WithStrategyPattern;
import com.vivek.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle{

    public OffroadVehicle() {
        super(new SportsDriveStrategy()); 
    }
    
}
