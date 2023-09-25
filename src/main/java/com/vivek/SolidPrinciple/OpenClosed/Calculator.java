package com.vivek.SolidPrinciple.OpenClosed;
/**
 * No modification in our calculator functionality
 * we can keep adding extension by creating new operations.
 */
public class Calculator {
    public int calculateResult(int num1, int num2, Operation operation){
        return operation.performOperation(num1, num2);
    }
}
