package com.vivek.SolidPrinciple.InterfaceSegregation.goodDesign;

/**
 * Implemented method what is actually operated by this class
 * We don't need to bother about file operation as interface segregated.
 */
public class DBDaoConnection implements DaoInterface,DBInterface {

    @Override
    public void openConnection() {
        
    }

    @Override
    public void createRecord() {
        
    }

    @Override
    public void deleteRecord() {
        
    }
    
}
