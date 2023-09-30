package com.vivek.SolidPrinciple.DependencyInversion.badDesign;
/**
 * Let's take similar example which we have in open closed.
 * Here we are having calculator with add and sub functionality.
 * and user is sending choice for it.
 * This operations are called as sub module in system.
 */
public class AddOperation {

    public int add(int a, int b) {
        return a+b;
    }
    
}
