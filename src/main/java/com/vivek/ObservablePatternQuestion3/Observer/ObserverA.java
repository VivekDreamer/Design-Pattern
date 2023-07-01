package com.vivek.ObservablePatternQuestion3.Observer;

public class ObserverA implements Observer{
    @Override
    public void update(String message) {
        System.out.println("observer A : "+message);
    }
}
