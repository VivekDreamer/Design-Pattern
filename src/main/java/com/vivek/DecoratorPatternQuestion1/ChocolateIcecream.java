package com.vivek.DecoratorPatternQuestion1;

public class ChocolateIcecream extends Icecream{
    @Override
    int cost() {
        return 70;
    }
    @Override
    public String getDescription() {
        return "chocolate ";
    } 
}
