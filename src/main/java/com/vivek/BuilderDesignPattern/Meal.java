package com.vivek.BuilderDesignPattern;
/**
 * In this builder design pattern, we have to seperate the construction of a complex object from its representation. By doing so,
 * the same construction process can create different representation.
 * It means for this meal class lets say we have different representation which VegMeal and NonVegMeal
 * So to achieve this, we have following components as part builder pattern.
 * 1. Product - Which we are building
 * 2. AbstractBuilder - Which is helpful to provide the product
 * 3. Concrete builder : It is actual builder which helps us to provide specific representation of the object.
 * 4. Director : Which uses this concrete builder 
 */
public class Meal {
    private String curry;
    private String bread;
    private String coldDrink;
    private String briyani;
    public String getCurry() {
        return curry;
    }
    public void setCurry(String curry) {
        this.curry = curry;
    }
    public String getBread() {
        return bread;
    }
    public void setBread(String bread) {
        this.bread = bread;
    }
    public String getColdDrink() {
        return coldDrink;
    }
    public void setColdDrink(String coldDrink) {
        this.coldDrink = coldDrink;
    }
    public String getBriyani() {
        return briyani;
    }
    public void setBriyani(String briyani) {
        this.briyani = briyani;
    }
    
}
