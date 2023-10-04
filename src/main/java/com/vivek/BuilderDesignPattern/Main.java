package com.vivek.BuilderDesignPattern;

/**
 * Builder pattern: It is a creational design pattern used to create the complex presentation of objects.
 * Let's say you have a class which has initially 4 fields, so you decided to go with the constructor. Then, few more fields are
 * added in the same class which are optional and class modification goes on. So one choice is to have different args constructor.
 * That is good but till some extent how we will remember which argument number for what if list is so big.
 * Having this type of constructor is called as Telescoping constructor pattern where we keep having seperate constructor as and
 * when we have new arguments.
 * One more option is there to use the setter methods but that has chances of missing pieces of some mandatory fields 
 * which leads to inconsistent object.
 * By builder pattern we take responsibility of creating object and providing back to the client. Client just provides input and until 
 * they won't call build method, we won't create the object.
 * Builder pattern is also used when single class has different object representation meaning. Let's say, we are creating burger
 * which can be veg or non veg, which can have extra cheeze or less cheeze, bread size medium,large & small. As user, you will say only
 * I need one extra cheeze large veg burger.
 * To do so, you can also have different builders which eventually passes the argument which are required to create that object.
 */
public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                        .egg(true)
                        .extraCheeze(true)
                        .lettuce(false)
                        .mayonese(false)
                        .size("LARGE")
                        .build();
        System.out.println(burger);
     
        Meal meal = new MealDirector(new VegMealBuilder()).prepareMeal(); 
    }
}
