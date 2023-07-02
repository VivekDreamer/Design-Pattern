package com.vivek.DecoratorPatternQuestion1;

public class RainbowSprinklerDecorator extends IcecreamDecorator{
    Icecream icecream;
    
    public RainbowSprinklerDecorator(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    int cost() {
        return icecream.cost() + 20;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription()+" with rainbow sparkles";
    }

    
    
}
