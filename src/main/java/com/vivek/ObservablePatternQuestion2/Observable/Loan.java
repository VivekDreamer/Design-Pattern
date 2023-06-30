package com.vivek.ObservablePatternQuestion2.Observable;

import java.util.ArrayList;
import java.util.List;

import com.vivek.ObservablePatternQuestion2.Observer.Observer;

public class Loan implements Subject{

    List<Observer> observers = new ArrayList<>();
    private String type;
    private float interest;
    private String bank;
    
    public Loan(String type, float interest, String bank) {
        this.type = type;
        this.interest = interest;
        this.bank = bank;
    }

    

    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer ob : observers)
        {
            System.out.println("Notifying observers on change in loan rate interest");
            ob.update(this.interest);
        }
    }
    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        this.interest = interest;
        notifyObserver();
    }
    public String getType() { return type; }
    public void setType(String type) { this.type = type;}
    public String getBank() { return bank; }
    public void setBank(String bank) { this.bank = bank; }
}
