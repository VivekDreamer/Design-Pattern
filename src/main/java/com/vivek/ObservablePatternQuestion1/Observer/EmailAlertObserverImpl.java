package com.vivek.ObservablePatternQuestion1.Observer;

import com.vivek.ObservablePatternQuestion1.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable stocksObservable;
    //constructor injection
    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
       sendEmail(emailId,"project in the stock, please hurry up!!!!");
    }

    private void sendEmail(String mailId, String msg) {
        System.out.println("mail sent to the : mailId --> "+msg);
        //sending email logic
    }
}
