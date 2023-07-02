package com.vivek.DecoratorPatternQuestion1;

public class Customer {
    public static void main(String[] args) {
        Icecream icecream = new ButterScotchIcecream();
        icecream = new ChocooChipsDecorator(new ChocolateSyrupDecorator(icecream));
        print(icecream);
    }
    private static void print(Icecream icecream) {
        System.out.println("desc : "+icecream.getDescription());
        System.out.println("cost : "+icecream.cost());
    }
}

    
