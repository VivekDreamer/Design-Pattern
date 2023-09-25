package com.vivek.SolidPrinciple.OpenClosed;
/**
 * This is good as we keep adding new operation implementation
 * and our calculator get extensions without modifying its main task
 * that is performing calculations.
 */
public interface Operation {
    public int performOperation(int num1, int num2);
}
