package com.vivek.ObservablePatternQuestion1.Observable;

import com.vivek.ObservablePatternQuestion1.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver obj);
    public void remove(NotificationAlertObserver obj);
    public void notifySubscribers();
    public void setStockCount(int newStocksAdded);
    public int getStockCount();
}
