package com.vivek.ObservablePatternQuestion1;

import com.vivek.ObservablePatternQuestion1.Observable.IPhoneObservableImpl;
import com.vivek.ObservablePatternQuestion1.Observable.StocksObservable;
import com.vivek.ObservablePatternQuestion1.Observer.EmailAlertObserverImpl;
import com.vivek.ObservablePatternQuestion1.Observer.MobileAlertObserverImpl;
import com.vivek.ObservablePatternQuestion1.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IPhoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("vivek", iphoneStocksObservable);
        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);
        iphoneStocksObservable.setStockCount(10);
    }
}
