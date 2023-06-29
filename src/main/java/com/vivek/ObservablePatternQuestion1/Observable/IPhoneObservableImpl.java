package com.vivek.ObservablePatternQuestion1.Observable;

import java.util.ArrayList;
import java.util.List;

import com.vivek.ObservablePatternQuestion1.Observer.NotificationAlertObserver;

public class IPhoneObservableImpl implements StocksObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifySubscribers() {
         for(NotificationAlertObserver observer : observerList)
            observer.update();
    }

    @Override
    public void setStockCount(int newStocksAdded) {
        if(stockCount == 0) notifySubscribers();
        stockCount = stockCount + newStocksAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
