package com.vivek.SolidPrinciple.LiskovSubstitution.goodDesign;

public interface SecureLoan extends LoanPayment{
    public void forceCloseLoan();
}
