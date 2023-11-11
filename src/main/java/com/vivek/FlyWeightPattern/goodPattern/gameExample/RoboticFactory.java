package com.vivek.FlyWeightPattern.goodPattern.gameExample;

import java.util.HashMap;
import java.util.Map;

import com.vivek.FlyWeightPattern.badPattern.gameExample.Sprites;

public class RoboticFactory {
    private static Map<String,IRobot> roboticObjectCache = new HashMap<>();
    public static IRobot createRobot(String robotType){
        if(roboticObjectCache.containsKey(robotType)){
            return roboticObjectCache.get(robotType);
        }else{
            if(robotType == "HUMANOID"){
                Sprites humanoidSprites = new Sprites();
                IRobot humanoidObject = new HumanoidRobot(robotType, humanoidSprites);
                roboticObjectCache.put(robotType, humanoidObject);
                return humanoidObject;
            } else if(robotType == "ROBOTICDOG"){
                Sprites roboticDogSprites = new Sprites();
                IRobot roboticDogObject = new RoboticDog(robotType, roboticDogSprites);
                roboticObjectCache.put(robotType, roboticDogObject);
                return roboticDogObject;
            }
        }
        return null;
    }
}
