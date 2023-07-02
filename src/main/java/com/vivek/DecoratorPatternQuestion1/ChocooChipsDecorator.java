package com.vivek.DecoratorPatternQuestion1;

public class ChocooChipsDecorator extends IcecreamDecorator{
    Icecream icecream;

    public ChocooChipsDecorator(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    int cost() {
        return icecream.cost() + 25;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription()+" with choco chips";
    }
    
    
}
