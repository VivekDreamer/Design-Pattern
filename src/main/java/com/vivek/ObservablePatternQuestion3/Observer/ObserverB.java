package com.vivek.ObservablePatternQuestion3.Observer;

public class ObserverB implements Observer{

    @Override
    public void update(String message) {
        System.out.println("observer B : "+message);
    }
    
}
