package com.vivek.SolidPrinciple.LiskovSubstitution.badDesign;

public class CreditCardLoan implements LoanPayment{

    @Override
    public void doPayment(int amount) {
        
    }

    @Override
    public void forceClosureOfLoan() {
        throw new UnsupportedOperationException("Force closure is not allowed.");
    }

    @Override
    public void doRepayment(int amount) {
        throw new UnsupportedOperationException("Repayment is not allowed.");
    }
    
}
