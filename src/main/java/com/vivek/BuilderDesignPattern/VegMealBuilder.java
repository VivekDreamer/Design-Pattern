package com.vivek.BuilderDesignPattern;

public class VegMealBuilder extends MealBuilder{

    private Meal meal;
    
    public VegMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void addBriyani() {
        this.meal.setBriyani("Veg");
    }

    @Override
    public void addBread() {
        this.meal.setBread("tandoori roti");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("pepsi");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
    
}
