package com.vivek.BuilderDesignPattern;
/**
 * Most common way to implement builder pattern is to have Builder class as inner class because : - you might have
 * seen at most of the places, Joshua Bloch's Builder pattern-
 * 1. We don't want to expose our constructor which eventually creates confusion at later stage.
 * 2. We don't want to have inconsistent object by having setters exposed.
 * 3. Now, as the constructor is private, we will need inner class to access that, which will have the same inputs what we have in class but without getters.
 */
public class Burger {
    private String size;
    private boolean egg;
    private boolean extraCheeze;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;
    private Burger(BurgerBuilder burgerBuilder){
        this.size = burgerBuilder.size;
        this.egg = burgerBuilder.egg;
        this.extraCheeze = burgerBuilder.extraCheeze;
        this.lettuce = burgerBuilder.lettuce;
        this.onion = burgerBuilder.onion;
        this.mayonese = burgerBuilder.mayonese;
    }
    public String getSize() {
        return size;
    }
    public boolean isEgg() {
        return egg;
    }
    public boolean isExtraCheeze() {
        return extraCheeze;
    }
    public boolean isMayonese() {
        return mayonese;
    }
    public boolean isOnion() {
        return onion;
    }
    public boolean isLettuce() {
        return lettuce;
    }
    public static class BurgerBuilder{
        private String size;
        private boolean egg;
        private boolean extraCheeze;
        private boolean mayonese;
        private boolean onion;
        private boolean lettuce;
        public BurgerBuilder size(String size){
            this.size = size;
            return this;
        }
        public BurgerBuilder egg(boolean egg){
            this.egg = egg;
            return this;
        }
        public BurgerBuilder extraCheeze(boolean extraCheeze){
            this.extraCheeze = extraCheeze;
            return this;
        }
        public BurgerBuilder mayonese(boolean mayonese){
            this.mayonese = mayonese;
            return this;
        }
        public BurgerBuilder onion(boolean onion){
            this.onion = onion;
            return this;
        }
        public BurgerBuilder lettuce(boolean lettuce){
            this.lettuce = lettuce;
            return this;
        }
        public Burger build(){
            return new Burger(this);
        }
    }
}
