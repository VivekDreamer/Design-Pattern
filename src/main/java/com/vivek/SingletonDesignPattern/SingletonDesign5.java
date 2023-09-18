package com.vivek.SingletonDesignPattern;

public class SingletonDesign5 {
    public static void main(String[] args) {
        X obj = X.INSTANCE;
        obj.i = 5;
        obj.show();

        //if it is not the singleton class then, it will give me output as 5 5 
        //but enum is using singleton pattern, so it will give me output as 5 6
        X obj1 = X.INSTANCE;
        obj1.i = 6;
        obj.show();
    }
}
//Advantage: Even if you are working with double checked locking, when we talk about deserialization,
//We have radObject() method , even our class uses singleton pattern, readObject() will give me the new Object.
//But in case of enum, it is having readResolve() method, it will use the current object. 
//enum only work with java 1.5 version and above.
enum X{
    //this is the special type of class. It will have private constructor already,
    INSTANCE;
    int i;
    public void show(){
        System.out.println(i);
    }
}
