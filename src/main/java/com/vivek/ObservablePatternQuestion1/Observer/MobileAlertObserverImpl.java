package com.vivek.ObservablePatternQuestion1.Observer;

import com.vivek.ObservablePatternQuestion1.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable stocksObservable;
    
    public MobileAlertObserverImpl(String userName, StocksObservable stocksObservable) {
        this.userName = userName;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName,"product is in th stock, hurry up!!!!!");
    }

    private void sendMessageOnMobile(String name, String msg) {
        System.out.println("msg sent to : "+userName);
        //logic to send the msg to the user on mobile
    }
}
