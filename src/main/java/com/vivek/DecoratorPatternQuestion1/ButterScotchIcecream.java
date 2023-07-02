package com.vivek.DecoratorPatternQuestion1;

public class ButterScotchIcecream extends Icecream{

    @Override
    int cost() {
        return 60;
    }

    @Override
    public String getDescription() {
        return "Butter Scotch";
    }
    
    
}
