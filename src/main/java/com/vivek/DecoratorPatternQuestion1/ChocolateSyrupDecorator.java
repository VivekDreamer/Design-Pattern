package com.vivek.DecoratorPatternQuestion1;

public class ChocolateSyrupDecorator extends IcecreamDecorator{
    Icecream icecream;

    public ChocolateSyrupDecorator(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    int cost() {
        return icecream.cost()+30;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription()+" with choco syrup";
    }
    
}
