package com.vivek.SolidPrinciple.InterfaceSegregation.goodDesign;
/**
 * This is good, we will only include the dao operation
 * and segregate connection part so client can implement the required interface.
 */
public interface DaoInterface {
    public void createRecord();
    public void deleteRecord();
}
