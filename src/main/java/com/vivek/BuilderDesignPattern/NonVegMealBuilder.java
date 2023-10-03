package com.vivek.BuilderDesignPattern;

public class NonVegMealBuilder extends MealBuilder{

    private Meal meal;
    public NonVegMealBuilder(){
        meal = new Meal();
    }
    @Override
    public void addBriyani() {
        this.meal.setBriyani("chicken");
    }

    @Override
    public void addBread() {
        this.meal.setBread("naan");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("vodka");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("non-veg");
    }

    @Override
    public Meal build() {
        return this.meal;
    }
    
}
