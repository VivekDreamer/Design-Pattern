package com.vivek.SolidPrinciple.SingleResponsibility;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AccountOperation {
    private static Map<Integer,Account> accountMap = new HashMap<>();
    public void addAccount(Account account){
        accountMap.put(account.getAccountNumber(), account);
    }
    public void updateAccount(Account account){
        accountMap.put(account.getAccountNumber(), account);
    }
    public Account getAccount(int accountNumber){
        return accountMap.get(accountNumber);
    }
    /**
     * Below method should not be the part of this class.
     * Reason is accountOperation are responsible for doing 
     * operation for account like add account, update account,
     * get account. However deposit is something called as transaction
     * which eventually not responsible by account.
     * Adding this method violates Single Responsibilty principle.
     * Create new class which actually does transaction related operations.
     */
    public void deposit(BigDecimal amount, int accountNumber){
        /*move this method to different class which has responsiblity
          of doing transactions.*/
    }
}
