package com.vivek.ObservablePatternQuestion2.Observer;

public class Internet implements Observer{

    @Override
    public void update(float interest) {
        System.out.println("Internet : Interest rate updated, new rate is : "+interest);
    }
    
}
