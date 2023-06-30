package com.vivek.ObservablePatternQuestion2;

import javax.security.auth.Subject;

import com.vivek.ObservablePatternQuestion2.Observable.Loan;
import com.vivek.ObservablePatternQuestion2.Observer.Internet;
import com.vivek.ObservablePatternQuestion2.Observer.Newspaper;
import com.vivek.ObservablePatternQuestion2.Observer.Observer;

public class Main {
    public static void main(String[] args) {
        //this will maintain all loan information
        Observer printMedia = new Newspaper();
        Observer onlineMedia = new Internet();
        Loan loan = new Loan("Personal loan", 12.5f, "Standard");
        loan.add(onlineMedia);
        loan.add(printMedia);
        loan.setInterest(13.5f);
    }
}
