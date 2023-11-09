package com.vivek.FlyWeightPattern.badPattern.gameExample;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < 5000000; i++){
            Sprites humanoidSprites = new Sprites();
            Robot humanoidRobotObj = new Robot(x+i, y+i, "HUMANOID", humanoidSprites);
        }
        for(int i = 0; i < 5000000; i++){
            Sprites roboticDogSprites = new Sprites();
            Robot roboticDogObj = new Robot(x+i, y+i, "HUMANOID", roboticDogSprites);
        }
    }
}
