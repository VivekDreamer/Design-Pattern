package com.vivek.SolidPrinciple.LiskovSubstitution.goodDesign;
/**
 * This is good as we are bothered to provide secure loan type
 * so this will behave perfectly fine even if we substitute between parent
 * and child.
 */
public class LoanClosureService {
    private SecureLoan secureLoan;
    public LoanClosureService(SecureLoan secureLoan){
        this.secureLoan = secureLoan;
    }
    public void forceCloseLoan(){
        secureLoan.forceCloseLoan();
    }
}
