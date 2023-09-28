package com.vivek.SolidPrinciple.InterfaceSegregation.badDesign;

public class BadDBDaoConnection implements BadDaoInterface{

    @Override
    public void openConnection() {
        //opening connection logic
    }

    @Override
    public void createRecord() {
        //create entry record
    }

    @Override
    public void openFile() {
        //As we are opening DB connection, no need to support open file.
    }

    @Override
    public void deleteRecord() {
        //delete entry record
    }
    
}
