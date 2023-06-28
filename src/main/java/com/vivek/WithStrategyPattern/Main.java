package com.vivek.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        Vehicle offroadVehicle = new OffroadVehicle();
        Vehicle goodsVehicle = new GoodsVehicle();
        sportsVehicle.drive();
        offroadVehicle.drive();
        goodsVehicle.drive();
    }
}
