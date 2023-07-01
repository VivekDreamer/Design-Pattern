package com.vivek.ObservablePatternQuestion3.Observable;

import java.util.ArrayList;
import java.util.List;

import com.vivek.ObservablePatternQuestion3.Observer.Observer;

public class ConcreteSubject implements Subject {
    private String message;
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
       observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(Observer ob : observers)
            ob.update(this.message);
    }

    public String getMessage() {
        return message;
    }
    @Override
    public void setMessage(String message) {
        this.message = message;
        notifySubscribers();
    }
}
