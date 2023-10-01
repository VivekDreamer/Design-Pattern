package com.vivek.SolidPrinciple.DependencyInversion.goodDesign;

public class SubOperation implements CalculatorOperation{

    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
    
}
