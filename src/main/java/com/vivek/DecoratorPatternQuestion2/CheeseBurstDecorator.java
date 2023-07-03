package com.vivek.DecoratorPatternQuestion2;

public class CheeseBurstDecorator extends PizzaDecorator{
    public CheeseBurstDecorator( Pizza pizza) { super(pizza); };
    @Override
    public String bake(){ return pizza.bake()+addCheezeBurst(); }
    private String addCheezeBurst() { return " cheeze "; };
    
}
