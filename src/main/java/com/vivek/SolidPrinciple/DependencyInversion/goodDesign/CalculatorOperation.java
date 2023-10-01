package com.vivek.SolidPrinciple.DependencyInversion.goodDesign;

/**
 * This is low level module interface so anything
 * to invoke in low level module needs to go via this interface
 * by this we will achieve both loosely coupled between low level and high level
 * module and abstraction is also there.
 */
public interface CalculatorOperation {
    public int calculate(int a, int b);
}
