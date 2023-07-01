package com.vivek.ObservablePatternQuestion3;

import com.vivek.ObservablePatternQuestion3.Observable.ConcreteSubject;
import com.vivek.ObservablePatternQuestion3.Observable.Subject;
import com.vivek.ObservablePatternQuestion3.Observer.Observer;
import com.vivek.ObservablePatternQuestion3.Observer.ObserverA;
import com.vivek.ObservablePatternQuestion3.Observer.ObserverB;
import com.vivek.ObservablePatternQuestion3.Observer.ObserverC;

public class Main {
    public static void main(String[] args) {
        Observer a = new ObserverA();
        Observer b = new ObserverB();
        Observer c = new ObserverC();
        Subject publisher = new ConcreteSubject();
        publisher.add(a);
        publisher.add(b);
        publisher.setMessage("message updated");
        publisher.add(c);
        publisher.setMessage("again updated");
    }
}
