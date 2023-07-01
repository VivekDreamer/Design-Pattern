package com.vivek.ObservablePatternQuestion3.Observer;

public class ObserverC implements Observer {

    @Override
    public void update(String message) {
       System.out.println("observer C : "+message);
    }
    
}
