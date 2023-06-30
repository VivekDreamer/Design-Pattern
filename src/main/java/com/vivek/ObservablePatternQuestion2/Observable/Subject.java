package com.vivek.ObservablePatternQuestion2.Observable;

import com.vivek.ObservablePatternQuestion2.Observer.Observer;

public interface Subject {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyObserver();
}
