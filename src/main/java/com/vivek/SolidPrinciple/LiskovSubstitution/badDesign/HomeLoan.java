package com.vivek.SolidPrinciple.LiskovSubstitution.badDesign;

public class HomeLoan implements LoanPayment{

    @Override
    public void doPayment(int amount) {
        
    }

    @Override
    public void forceClosureOfLoan() {
        
    }

    @Override
    public void doRepayment(int amount) {
        
    }
    
}
