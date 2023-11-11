package com.vivek.FlyWeightPattern.goodPattern.gameExample;

import com.vivek.FlyWeightPattern.badPattern.gameExample.Sprites;

public class RoboticDog implements IRobot{

    private String type;
    private Sprites body; // small 2D bitmap (graphic element)
    
    public RoboticDog(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }
    public String getType() {
        return type;
    }
    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        //Uses the humanoid sprite object
        //and x and y coordinate to render the image.
    }
    
}
