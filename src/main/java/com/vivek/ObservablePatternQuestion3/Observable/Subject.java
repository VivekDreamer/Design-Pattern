package com.vivek.ObservablePatternQuestion3.Observable;

import com.vivek.ObservablePatternQuestion3.Observer.Observer;

public interface Subject {
    //call add() to add the observer to the observer list
    public void add(Observer observer);
    //call remove() to remove the observer from the observer list
    public void remove(Observer observer);
    //call notify to publish all the changes made by the subject
    public void notifySubscribers();
    public void setMessage(String message);
}
