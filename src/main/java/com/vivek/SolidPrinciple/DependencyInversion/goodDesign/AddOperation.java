package com.vivek.SolidPrinciple.DependencyInversion.goodDesign;
/**
 * So we will have this class but it will be taken care 
 * by interface implementation.
 */
public class AddOperation implements CalculatorOperation {
    @Override
    public int calculate(int a, int b){
        return a+b;
    }
}
