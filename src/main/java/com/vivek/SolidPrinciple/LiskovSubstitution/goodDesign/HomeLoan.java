package com.vivek.SolidPrinciple.LiskovSubstitution.goodDesign;

public class HomeLoan implements SecureLoan {

    @Override
    public void doPayment(int amount) {
        
    }

    @Override
    public void forceCloseLoan() {
        
    }
}
