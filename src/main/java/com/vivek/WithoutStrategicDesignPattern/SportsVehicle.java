package com.vivek.WithoutStrategicDesignPattern;

public class SportsVehicle extends Vehicle {

    @Override
    public void drive() {
        //different drive logic
        System.out.println("sports drive capability");
    }
    
}
