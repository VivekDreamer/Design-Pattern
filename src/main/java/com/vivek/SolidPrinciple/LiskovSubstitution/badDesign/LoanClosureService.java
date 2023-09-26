package com.vivek.SolidPrinciple.LiskovSubstitution.badDesign;
/**
 * This is the loan closure service whichis responsible to close
 * the loan before its actual due date. Now since, credit card loan is
 * not supporting force closure, it will throw an exception which is wrong in
 * design where we are unable to substitute the subtype with supertype.
 * This is violation of Liskov Substitution rule.
 * Solution to this, let's segregate the method in different super types
 * and make supertype substituable at any given time.
 */
public class LoanClosureService {
    private LoanPayment loanPayment;
    public LoanClosureService(LoanPayment loanPayment){
        this.loanPayment = loanPayment;
    }
    public void forceClosure(){
        loanPayment.forceClosureOfLoan();
    }
}
