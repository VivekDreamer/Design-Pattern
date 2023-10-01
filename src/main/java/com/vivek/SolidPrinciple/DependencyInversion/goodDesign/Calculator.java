package com.vivek.SolidPrinciple.DependencyInversion.goodDesign;
/**
 * As per DIP rule, it states :
 * High level module should not depend on low level modules. Both should depend on abstractions.
 * --So low level is dependent via CalculatorOpration rather being depend on add or subtract operation.
 * Abstractions should not depend on details. Details should depend on abstraction.
 * --Abstraction is achieved as via interface we are entring in low level.
 */
public class Calculator {
    public int calculate(int a, int b, CalculatorOperation operation){
        return operation.calculate(a, b);
    }
}
