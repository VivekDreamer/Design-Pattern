package com.vivek.SolidPrinciple.SingleResponsibility;

import java.math.BigDecimal;

public class TransactionOperation {
    //this class is only doing transaction related operations
    public void deposit(BigDecimal amount, int accountNumber){
        //getting account detail is the job of account operation class
        AccountOperation accountOperation = new AccountOperation();
        Account account = accountOperation.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withdraw(BigDecimal amount, int accountNumber){
        AccountOperation accountOperation = new AccountOperation();
        Account account = accountOperation.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }
}
