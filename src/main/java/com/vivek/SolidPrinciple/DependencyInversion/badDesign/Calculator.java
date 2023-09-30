package com.vivek.SolidPrinciple.DependencyInversion.badDesign;
/**
 * Parent module or main module of calculator which helps to calculate
 * as per user's choice
 * As per Dependency Inversion rule it states:
 * High level modules should not depend on low level modules. Both should depend on abstraction.
 * So, above rule is broken as our calculator class is directly dependent on low level class.
 * Abstraction should not depend on details. Details should depend on abstractions.
 * Also is dependent on actual class. 
 */
public class Calculator {
    public int calculate(int a, int b, String operation){
        int result = 0;
        switch(operation){
            case "add":
                AddOperation addOperation = new AddOperation();
                result = addOperation.add(a,b);
                break;
            case "sub":
                SubOperation subOperation = new SubOperation();
                result = subOperation.sub(a,b);
                break;
        }
        return result;
    }
}
