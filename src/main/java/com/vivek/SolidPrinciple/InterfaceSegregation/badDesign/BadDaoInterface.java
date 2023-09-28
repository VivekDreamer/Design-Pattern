package com.vivek.SolidPrinciple.InterfaceSegregation.badDesign;

/**
 * This dao interface defined to support data access using file system
 * or database system. So we have added open connection and open file for it
 * This is bad because we have accomodate all operations in single interface.
 */
public interface BadDaoInterface {
    public void openConnection();
    public void createRecord();
    public void openFile();
    public void deleteRecord();
}
