package com.vivek.SolidPrinciple.InterfaceSegregation.badDesign;

public class BadFileDaoConnection implements BadDaoInterface{

    @Override
    public void openConnection() {
        //we can't open DB connection in file system.
    }

    @Override
    public void createRecord() {
       
    }

    @Override
    public void openFile() {
        
    }

    @Override
    public void deleteRecord() {
        
    }
    
}
