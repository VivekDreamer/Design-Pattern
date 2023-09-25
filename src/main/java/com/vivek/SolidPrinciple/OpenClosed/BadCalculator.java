package com.vivek.SolidPrinciple.OpenClosed;
/**
 * This is the bad design as we are taking type 
 * and for each type we are having cases.
 * Now, if we want to introduce division, we have to modify calculator.
 */
public class BadCalculator {
    public int calculateResult(int num1, int num2, String type){
        int res = 0;
        switch(type){
            case "sum":
                res = num1+num2;
            case "sub":
                res = num1-num2;
        }
        return res;
    }
}
