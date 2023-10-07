package com.vivek.PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static Map<String,Vehicle> mapVehicle = new HashMap<>();
    static{
        mapVehicle.put("TWO", new TwoWheelerVehicle("120", "royal", 100000, false));
        mapVehicle.put("FOUR", new FourWheelerVehicle("120", "bmw", 100000, false, false));
    }
    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException{
        return mapVehicle.get(vehicle).clone();
    }
}
