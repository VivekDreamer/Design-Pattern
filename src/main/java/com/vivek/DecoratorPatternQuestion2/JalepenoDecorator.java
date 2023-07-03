package com.vivek.DecoratorPatternQuestion2;

public class JalepenoDecorator extends PizzaDecorator{
    public JalepenoDecorator(Pizza pizza) { super(pizza); }
    @Override
    public String bake() { return pizza.bake()+addJalepano(); }
    private String addJalepano() { return " jalepano "; }
}
