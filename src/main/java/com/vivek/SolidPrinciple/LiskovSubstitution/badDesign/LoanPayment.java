package com.vivek.SolidPrinciple.LiskovSubstitution.badDesign;
/**
 * This is loan interface responsible for payment related operations on loan account
 * LoanPayment is implemented by actual loans like HomeLoan, creditCardLoan etc.
 * For credit card loan which is unsecured, forceClosure and repayment is not allowed.
 */
public interface LoanPayment {
    public void doPayment(int amount);
    public void forceClosureOfLoan();
    public void doRepayment(int amount);
}
