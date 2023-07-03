package com.vivek.DecoratorPatternQuestion2;

public class Main {
    public static void main(String[] args) {
        //here we got pizza with different toppings, and we can add more toppings here
        Pizza pizza = new JalepenoDecorator(new CheeseBurstDecorator(new BasePizza()));
        Pizza pizzaWithMoreDecorator = new CheeseBurstDecorator(new CheeseBurstDecorator(new JalepenoDecorator(new CheeseBurstDecorator(new BasePizza()))));
        System.out.println(pizza.bake());
        System.out.println(pizzaWithMoreDecorator.bake());
    }
}
