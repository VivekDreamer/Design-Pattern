package com.vivek.ObservablePatternQuestion2.Observer;

public class Newspaper implements Observer{

    @Override
    public void update(float interest) {
        System.out.println("Newspaper : Interest rate updated, new rate is : "+interest);
    }
}
