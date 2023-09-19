package com.vivek.SingletonDesignPattern;

public class SingletonDesign5 {
    public static void main(String[] args) {
        EnumSingleton obj = EnumSingleton.INSTANCE;
        obj.i = 5;
        obj.show();

        //if it is not the singleton class then, it will give me output as 5 5 
        //but enum is using singleton pattern, so it will give me output as 5 6
        EnumSingleton obj1 = EnumSingleton.INSTANCE;
        obj1.i = 6;
        obj.show();
    }
}
//Advantage: Even if you are working with double checked locking, when we talk about deserialization,
//We have readObject() method , even our class uses singleton pattern, readObject() will give me the new Object.
//But in case of enum, it is having readResolve() method, it will use the current object. 
//enum only work with java 1.5 version and above.

/**
 * Here we described creating singleton using enum but why?
 * Let's say in Lazy Init method you access constructor by reflection (Reason being you can access private constructor using reflection!!)
 * and create the object which eventually creates the problem by having multiple instances.
 *
 * ENUM's constructor gets invoked by JVM not by User who is using so it is safe to use.
 * Another advantage of using enum is , we don't need to worry about threads as it is thread safe.
 * It also solved the problem of Serialization as JVM takes care to return same object.
 *
 */
enum EnumSingleton{
    //this is the special type of class. It will have private constructor already,
    INSTANCE;
    int i;
    public void show(){
        System.out.println(i);
    }
}
