package com.vivek.SolidPrinciple.SingleResponsibility;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(1);
        account.setFirstName("nishtha");
        account.setTotalAmount(BigDecimal.valueOf(1000000));
        AccountOperation accountOperation = new AccountOperation();
        accountOperation.addAccount(account);
        TransactionOperation transactionOperation = new TransactionOperation();
        transactionOperation.deposit(BigDecimal.valueOf(10000), 1);
    }
}
 